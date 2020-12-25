package com.data.util;

import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zyl
 * @date 2020/12/25 15:31
 * @describe 描述
 */
@Slf4j
public class JsonUtil {

    private static boolean isHandleError = false;

    public static String getJsonString(JsonObject jsonObject, String apiName) {
        try {
            if (jsonObject.get(apiName).isJsonNull() || "".equals(jsonObject.get(apiName).getAsString())) {
                return Constant.STRING_NULL;
            }
            return jsonObject.get(apiName).getAsString();
        } catch (Exception e) {
            log.error("jsonObject: {}, apiName: {}, error: {}", jsonObject, apiName, e);
            if (isHandleError) {
                return Constant.STRING_NULL;
            } else {
                throw new RuntimeException("apiName: "+ apiName + "， 原本类型: " + "文本" + ", 存: " + "String");
            }
        }
    }
}
