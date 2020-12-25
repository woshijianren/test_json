package com.data.mapper;

import cn.hutool.core.util.StrUtil;
import com.data.entity.ProjectEntity;
import com.data.entity.TestEntity;
import com.google.gson.Gson;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zyl
 * @date 2020/12/25 10:22
 * @describe 描述
 */
public class GenericTypeHandler extends BaseTypeHandler<ProjectEntity> {

    private static Gson gson = new Gson();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ProjectEntity parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, gson.toJson(parameter));
    }

    @Override
    public ProjectEntity getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String data = rs.getString(columnName);
        return StrUtil.isBlank(data) ? null : gson.fromJson(data, (Class<ProjectEntity>) getRawType());
    }

    @Override
    public ProjectEntity getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String data = rs.getString(columnIndex);
        return StrUtil.isBlank(data) ? null : gson.fromJson(data, (Class<ProjectEntity>) getRawType());
    }

    @Override
    public ProjectEntity getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String data = cs.getString(columnIndex);
        return StrUtil.isBlank(data) ? null : gson.fromJson(data, (Class<ProjectEntity>) getRawType());
    }
}