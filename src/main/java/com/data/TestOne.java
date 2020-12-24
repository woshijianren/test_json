package com.data;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.lucene.util.RamUsageEstimator;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestOne {

    public static  String jsonStr = "{\n" +
            "    \"BusinessTerm__u\": \"2\",\n" +
            "    \"participant_ids\": null,\n" +
            "    \"owner_id\": [\n" +
            "      {\n" +
            "        \"id\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"name\": \"田艳勤\",\n" +
            "        \"label\": \"田艳勤\",\n" +
            "        \"value\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"avatar\": null\n" +
            "      }\n" +
            "    ],\n" +
            "    \"business_stage\": null,\n" +
            "    \"total_num\": 11,\n" +
            "    \"fundManager__u\": null,\n" +
            "    \"province__u\": {\n" +
            "      \"value\": \"5d1181e1d05f3566e785ee93\",\n" +
            "      \"label\": \"中国农业发展银行总行\"\n" +
            "    },\n" +
            "    \"city__u\": {\n" +
            "      \"value\": \"5d1181e1d05f3566e785ee93\",\n" +
            "      \"label\": \"中国农业发展银行总行\"\n" +
            "    },\n" +
            "    \"BusinessScope__u\": \"2\",\n" +
            "    \"id\": \"5fc9af70e3da732e42b6041b\",\n" +
            "    \"tag\": null,\n" +
            "    \"current_stage\": null,\n" +
            "    \"app_id\": \"investment\",\n" +
            "    \"fundEquityRatio__u\": null,\n" +
            "    \"isChange__u\": null,\n" +
            "    \"county__u\": {\n" +
            "      \"value\": \"5d1181e1d05f3566e785ee93\",\n" +
            "      \"label\": \"中国农业发展银行总行\"\n" +
            "    },\n" +
            "    \"version\": 69,\n" +
            "    \"created_by\": [\n" +
            "      {\n" +
            "        \"id\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"name\": \"田艳勤\",\n" +
            "        \"label\": \"田艳勤\",\n" +
            "        \"value\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"avatar\": null\n" +
            "      }\n" +
            "    ],\n" +
            "    \"agencyIinfmt__u\": null,\n" +
            "    \"bad__u\": null,\n" +
            "    \"guaranty__u\": null,\n" +
            "    \"equityPledge__u\": null,\n" +
            "    \"name\": \"test2\",\n" +
            "    \"registeredCapital__u\": \"2.00\",\n" +
            "    \"credInfor__u\": null,\n" +
            "    \"tenant_id\": \"5f1181cfc05e8475e785de7f\",\n" +
            "    \"exitWay__u\": null,\n" +
            "    \"legalAction__u\": null,\n" +
            "    \"Number__u\": \"1\",\n" +
            "    \"punishment__u\": null,\n" +
            "    \"residence__u\": \"2\",\n" +
            "    \"created_at\": 1607053168182,\n" +
            "    \"last_modified_at\": 1607053168182,\n" +
            "    \"capitalPaid__u\": null,\n" +
            "    \"timeEstablishment__u\": 1607011200000,\n" +
            "    \"is_deleted\": false,\n" +
            "    \"object_describe_api_name\": \"company__u\",\n" +
            "    \"investmBalance__u\": \"200000000.00\",\n" +
            "    \"investmAmt__u\": \"200000000.00\",\n" +
            "    \"enterpriseType__u\": \"2\",\n" +
            "    \"lock_state\": null,\n" +
            "    \"creditCode__u\": \"2\",\n" +
            "    \"entrySubject__u\": null,\n" +
            "    \"last_modified_by\": [\n" +
            "      {\n" +
            "        \"id\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"name\": \"田艳勤\",\n" +
            "        \"label\": \"田艳勤\",\n" +
            "        \"value\": \"5fb878ea4e84db7c05f0e14a\",\n" +
            "        \"avatar\": null\n" +
            "      }\n" +
            "    ],\n" +
            "    \"currency_unit\": \"CNY\",\n" +
            "    \"otherInfor__u\": null,\n" +
            "    \"current_rate_version\": \"1\",\n" +
            "    \"movPropPledge__u\": null,\n" +
            "    \"record_type\": \"default__u\",\n" +
            "    \"isSmallEnterprise__u\": null,\n" +
            "    \"LegalRepresentative__u\": \"2\",\n" +
            "    \"taxInformation__u\": null,\n" +
            "    \"extend_obj_data_id\": null,\n" +
            "    \"favourite\": false,\n" +
            "    \"standard_currency\": \"CNY\"\n" +
            "  }";

    public static Gson gson = new Gson();

    public static void main(String[] args) {

        System.out.println(RamUsageEstimator.humanSizeOf(jsonStr));
        System.out.println(System.currentTimeMillis());
        JsonObject jsonObject = gson.fromJson(jsonStr, JsonObject.class);
        System.out.println(System.currentTimeMillis());
        System.out.println(RamUsageEstimator.humanSizeOf(jsonObject));
        JsonArray jsonArray = new JsonArray();
        System.out.println(RamUsageEstimator.humanSizeOf(jsonArray));
        long beginMiLLS = System.currentTimeMillis();
        int size = 0;
        try {
            while (true) {
                jsonArray.add(gson.fromJson(jsonStr, JsonObject.class));
                size ++;
                if (size % 1000 == 0) {
                    System.out.println("size=" + size + ", 内存=" + RamUsageEstimator.humanSizeOf(jsonArray));
                    while (true) {
                        jsonArray.addAll((JsonArray) jsonArray.clone());
                        System.out.println("size=" + size + ", 内存=" + RamUsageEstimator.humanSizeOf(jsonArray));

                    }
                }
            }
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println(jsonArray.size());
            System.out.println(RamUsageEstimator.humanSizeOf(jsonArray));
            System.out.println(System.currentTimeMillis() - beginMiLLS);
        }

    }

    static class Test1 {

        public static void main(String[] args) throws CloneNotSupportedException {
            TestEntity a = new TestEntity(1, "aa");
            List<TestEntity> aList = new ArrayList<>();
            int count = 0;
            while (true) {
                TestEntity clone = (TestEntity)a.clone();
                aList.add(clone);
                count ++;
                if (count == 100000) {
                    break;
                }
            }
            aList.get(3).setId(10);
            System.out.println(aList.get(1111));
        }
    }
}
