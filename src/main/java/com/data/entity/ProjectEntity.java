package com.data.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zyl
 * @date 2020/12/25 9:49
 * @describe 描述
 */
@Data
public class ProjectEntity {

    private String BusinessTerm__u;
    private String participant_ids;

    private List<RadioEntity> owner_id;
    private String business_stage;
    private Integer total_num;
    private String fundManager__u;
    private NationEntity province__u;

    private NationEntity city__u;


    private String BusinessScope__u;
    private String id;
    private String tag;
    private String current_stage;
    private String app_id;
    private String fundEquityRatio__u;
    private String isChange__u;
    private NationEntity county__u;


    private Integer version;
    private List<RadioEntity> created_by;

    private String agencyIinfmt__u;
    private String bad__u;
    private String guaranty__u;
    private String equityPledge__u;
    private String name;
    private String registeredCapital__u;
    private String credInfor__u;
    private String tenant_id;
    private String exitWay__u;
    private String legalAction__u;
    private String Number__u;
    private String punishment__u;
    private String residence__u;
    private String created_at;
    private String last_modified_at;
    private String capitalPaid__u;
    private String timeEstablishment__u;
    private String is_deleted;
    private String object_describe_api_name;
    private BigDecimal investmBalance__u;
    private BigDecimal investmAmt__u;
    private String enterpriseType__u;
    private String lock_state;
    private String creditCode__u;
    private String entrySubject__u;
    private List<RadioEntity> last_modified_by;

    private String currency_unit;
    private String otherInfor__u;
    private String current_rate_version;
    private String movPropPledge__u;
    private String record_type;
    private String isSmallEnterprise__u;
    private String LegalRepresentative__u;
    private String taxInformation__u;
    private String extend_obj_data_id;
    private String favourite;
    private String standard_currency;
}
