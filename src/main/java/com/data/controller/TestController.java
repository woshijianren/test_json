package com.data.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.data.entity.NationEntity;
import com.data.entity.ProjectEntity;
import com.data.entity.TestEntity;
import com.data.mapper.TestMapper;
import com.data.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.apache.lucene.util.RamUsageEstimator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {

    public static Gson gson = new Gson();

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/loop")
    public Integer loop(int size) {
        List<String> query = testMapper.query(size);
        String collect = query.stream().collect(Collectors.joining(",", "[", "]"));
        JsonArray jsonArray = gson.fromJson(collect, JsonArray.class);
        List<ProjectEntity> projectEntityList = gson.fromJson(jsonArray, new TypeToken<List<ProjectEntity>>() {
        }.getType());
        long currentMills = System.currentTimeMillis();
        for (ProjectEntity projectEntity : projectEntityList) {
            String a = projectEntity.getBusiness_stage();
            String a1 = a;
            String a2 = a1;
            String a3 = a2;
            String a4 = a3;
            String a5 = a4;
            String a6 = a5;
            String a7 = a6;
            String a8 = a7;
            String a9 = a8;
            String a10 = a9;
            String a11 = a10;
            String a12 = a11;
            String a13 = a12;
            String a14 = a13;
            String a15 = a14;
            String a16 = a15;
            String a17 = a16;
            String a18 = a17;
            String a19 = a18;
            String a20 = a19;
            String a21 = a20;
            String a22= a21;
            String a23 = a22;
            String a24 = a23;
            String a25 = a24;
            String a26 = a25;
            String a27 = a26;
            String a28 = a27;
            String a29 = a28;
            String a30 = a29;
            String a31 = a30;
            String a32 = a31;
            String a33 = a32;
            String a34 = a33;
            String a35 = a34;
            String a36 = a35;
            String a37 = a36;
            String a38 = a37;

//            String agencyIinfmt__u = projectEntity.getAgencyIinfmt__u();
//            String app_id = projectEntity.getApp_id();
//            String bad__u = projectEntity.getBad__u();
//            String businessScope__u = projectEntity.getBusinessScope__u();
//            String businessTerm__u = projectEntity.getBusinessTerm__u();
//            String capitalPaid__u = projectEntity.getCapitalPaid__u();
//            NationEntity city__u = projectEntity.getCity__u();
//            NationEntity county__u = projectEntity.getCounty__u();
//            String created_at = projectEntity.getCreated_at();
//            String credInfor__u = projectEntity.getCredInfor__u();
//            String currency_unit = projectEntity.getCurrency_unit();
//            String enterpriseType__u = projectEntity.getEnterpriseType__u();
//
//            String business_stage1 = business_stage;
//            String agencyIinfmt__u1 = agencyIinfmt__u;
//            String app_id1 = app_id;
//            String bad__u1 = bad__u;
//            String businessScope__u1 = businessScope__u;
//            String businessTerm__u1 = businessTerm__u;
//            String capitalPaid__u1 = capitalPaid__u;
//            NationEntity city__u1 = city__u;
//            NationEntity county__u1 = county__u;
//            String created_at1 = created_at;
//            String credInfor__u1 = credInfor__u;
//            String currency_unit1 = currency_unit;
//            String enterpriseType__u1 = enterpriseType__u;
//
//            String business_stage2 = business_stage;
//            String agencyIinfmt__u2 = agencyIinfmt__u;
//            String app_id2 = app_id;
//            String bad__u2 = bad__u;
//            String businessScope__u2 = businessScope__u;
//            String businessTerm__u2 = businessScope__u2;
//            String capitalPaid__u2 = capitalPaid__u;
//            NationEntity city__u2 = city__u;
//            NationEntity county__u2 = county__u;
//            String created_at2 = projectEntity.getCreated_at();
//            String credInfor__u2 = projectEntity.getCredInfor__u();
//            String currency_unit2 = projectEntity.getCurrency_unit();
//            String enterpriseType__u2 = projectEntity.getEnterpriseType__u();
        }
//        for (JsonElement jsonElement : jsonArray) {
//            JsonObject jsonObject = jsonElement.getAsJsonObject();
//            JsonElement jsonElement1 = jsonObject.get("BusinessTerm__u");
//            JsonElement jsonElement2 = jsonObject.get("participant_ids");
//            JsonElement jsonElement3 = jsonObject.get("owner_id");
//            JsonElement jsonElement4 = jsonObject.get("business_stage");
//            JsonElement jsonElement5 = jsonObject.get("total_num");
//            JsonElement jsonElement6 = jsonObject.get("fundManager__u");
//            JsonElement jsonElement7 = jsonObject.get("province__u");
//            JsonElement jsonElement8 = jsonObject.get("city__u");
//            JsonElement jsonElement9 = jsonObject.get("BusinessScope__u");
//            JsonElement jsonElement10 = jsonObject.get("id");
//            JsonElement jsonElement11 = jsonObject.get("tag");
//            JsonElement jsonElement12 = jsonObject.get("current_stage");
//            JsonElement jsonElement13 = jsonObject.get("app_id");
//
//            JsonElement jsonElement21= jsonElement1;
//            JsonElement jsonElement31= jsonElement2;
//            JsonElement jsonElement41= jsonElement3;
//            JsonElement jsonElement51= jsonElement4;
//            JsonElement jsonElement61= jsonElement10;
//            JsonElement jsonElement71= jsonElement11;
//            JsonElement jsonElement81= jsonElement12;
//            JsonElement jsonElement91= jsonElement13;
//            JsonElement jsonElement111= jsonElement41;
//            JsonElement jsonElement112= jsonElement1;
//            JsonElement jsonElement113= jsonElement2;
//            JsonElement jsonElement114= jsonElement3;
//
//            JsonElement jsonElement115=jsonElement4;
//            JsonElement jsonElement211=jsonElement5;
//            JsonElement jsonElement311=jsonElement6;
//            JsonElement jsonElement411=jsonElement7;
//            JsonElement jsonElement511=jsonElement5;
//            JsonElement jsonElement611=jsonElement9;
//            JsonElement jsonElement711=jsonElement10;
//            JsonElement jsonElement811=jsonElement1;
//            JsonElement jsonElement911=jsonElement1;
//            JsonElement jsonElement14 = jsonObject.get("fundEquityRatio__u");
//            JsonElement jsonElement15 = jsonObject.get("isChange__u");
//            JsonElement jsonElement16 = jsonObject.get("county__u");
//            JsonElement jsonElement17 = jsonObject.get("version");
//            JsonElement jsonElement18 = jsonObject.get("created_by");
//            JsonElement jsonElement19 = jsonObject.get("agencyIinfmt__u");
//
//            // 没有用JsonElement接收是60ms
//            JsonElement jsonElement20 = jsonObject.get("bad__u");
//            JsonElement jsonElement21 = jsonObject.get("guaranty__u");
//            JsonElement jsonElement22 = jsonObject.get("equityPledge__u");
//            JsonElement jsonElement23 = jsonObject.get("name");
//            JsonElement jsonElement24 = jsonObject.get("registeredCapital__u");
//            JsonElement jsonElement25 = jsonObject.get("credInfor__u");
//            JsonElement jsonElement26 = jsonObject.get("tenant_id");
//            JsonElement jsonElement27 = jsonObject.get("exitWay__u");
//            JsonElement jsonElement28 = jsonObject.get("legalAction__u");
//            JsonElement jsonElement29 = jsonObject.get("Number__u");
//            JsonElement jsonElement30 = jsonObject.get("punishment__u");
//            JsonElement jsonElement31 = jsonObject.get("residence__u");
//            JsonElement jsonElement32 = jsonObject.get("created_at");
//            JsonElement jsonElement33 = jsonObject.get("last_modified_at");
//            JsonElement jsonElement34 = jsonObject.get("capitalPaid__u");
//            JsonElement jsonElement35 = jsonObject.get("timeEstablishment__u");
//            JsonElement jsonElement36 = jsonObject.get("is_deleted");
//            JsonElement jsonElement37 = jsonObject.get("object_describe_api_name");
//            String businessTerm__u = JsonUtil.getJsonString(jsonObject, "BusinessTerm__u");
//            String participant_ids = JsonUtil.getJsonString(jsonObject, "participant_ids");
//            String ownerId = jsonObject.get("owner_id").getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();

//        }
        System.out.println(System.currentTimeMillis() - currentMills);
        return jsonArray.size();
    }


    @GetMapping("/query")
    public int query(int size) {
        System.out.println(Runtime.getRuntime().totalMemory());
        long sqlQueryBeginMills = System.currentTimeMillis();
        List<String> query = testMapper.query(size);
        System.out.println("sql查询时间: " + (System.currentTimeMillis() - sqlQueryBeginMills) + "ms");
        long streamSpliceMills = System.currentTimeMillis();
        String collect = query.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("流拼接时间: " + (System.currentTimeMillis() - streamSpliceMills));
        long beginTransToJsonArrayMills = System.currentTimeMillis();
        JSONArray jsonArray = JSONArray.parseArray(collect);
//        JsonArray jsonArray = new Gson().fromJson(collect, JsonArray.class);
        System.out.println("转JsonArray的时间: " + (System.currentTimeMillis() - beginTransToJsonArrayMills));
        // 这里会产生大量的GC
        System.out.println(RamUsageEstimator.humanSizeOf(jsonArray));

        long beginReverseEntityMills = System.currentTimeMillis();
        System.out.println("开始转list的时间：" + beginReverseEntityMills);
//        List<TestEntity> testEntityList = new Gson().fromJson(jsonArray, new TypeToken<List<TestEntity>>() {
//        }.getType());
        List<ProjectEntity> testEntityList = JSONArray.parseArray(collect, ProjectEntity.class);
        System.out.println("转换消耗时间: " + (System.currentTimeMillis() - beginReverseEntityMills) + "ms, testEntityList的size=" + testEntityList.size());
        System.out.println(RamUsageEstimator.humanSizeOf(testEntityList));
//        List<TestEntity> entityList = new ArrayList<>();
//        for (JsonElement jsonElement : jsonArray) {
//            JsonObject jsonObject = jsonElement.getAsJsonObject();
//            TestEntity test = new TestEntity();
//            long entityBeginMills = System.currentTimeMillis();
//            BigDecimal investmentBalance = jsonObject.get("investmBalance__u").getAsBigDecimal();
//            test.setInvestmentBalance(investmentBalance);
//            test.setA(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setB(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setC(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setD(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setE(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setF(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setG(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            test.setH(jsonObject.get("investmBalance__u").getAsBigDecimal());
//            System.out.println("实体赋值时间: " + (System.currentTimeMillis() - entityBeginMills));
//            entityList.add(test);
//        }
//        System.out.println("entityList的size: " + RamUsageEstimator.humanSizeOf(entityList));
        System.out.println(Runtime.getRuntime().totalMemory());
        return jsonArray.size();
    }


    @GetMapping("/queryEntity")
    public int queryEntity(Integer size) {
        long beginQueryMills = System.currentTimeMillis();
        List<ProjectEntity> projectEntityList = testMapper.queryEntityList(size);
        System.out.println("sql查询耗时: " + (System.currentTimeMillis() - beginQueryMills));
        long beginCalcSizeMills = System.currentTimeMillis();
        System.out.println(RamUsageEstimator.humanSizeOf(projectEntityList));
        System.out.println("计算内存占用耗时: " + (System.currentTimeMillis() - beginCalcSizeMills));
        System.out.println(projectEntityList.get(10000));
        return projectEntityList.size();
    }
//    @GetMapping("/http/query")
//    public String httpQuery() {
//        URL
//    }

//    public static String doGet(String httpUrl) {
//        HttpURLConnection connection = null;
//        InputStream is = null;
//        BufferedReader br = null;
//        String result = null;
//        try {
//            URL url = new URL(httpUrl);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            connectio
//        }
//    }
}
