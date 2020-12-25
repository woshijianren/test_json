-Xms128m
-Xmx1967m
-XX:ReservedCodeCacheSize=240m
-XX:+UseConcMarkSweepGC
-XX:SoftRefLRUPolicyMSPerMB=50
-ea
-XX:CICompilerCount=2
-Dsun.io.useCanonPrefixCache=false
-Djdk.http.auth.tunneling.disabledSchemes=""
-XX:+HeapDumpOnOutOfMemoryError
-XX:-OmitStackTraceInFastThrow
-Djdk.attach.allowAttachSelf=true
-Dkotlinx.coroutines.debug=off
-Djdk.module.illegalAccess.silent=true

可以查询128000，129000就会OutOfMemory

但是如果将gson的JsonArray转成List<TestEntity>存储，则可以查询600000只占用1.5GB

fastjson的确是比gson快，转成JsonArray占用的内存也小，128000个Project的json，gson的JsonArray是1.6G，但是fastgson只要819M
但是百度了一下，说是fastjson的坑还蛮多的，所以还是不要换成fastjson，转成List<ProjectEntity>,两者占用的内存相差不多

10W条Json数据的遍历37个字段是500ms，1W是60ms, 而如果是将遍历的37字段拆分，14个取值，然后2次14个从这里赋值，就是30ms


10W个实体对象，会被预热，然后变成1-4毫秒级别的

一切皆对象，所以JsonArray也是通过一些基本的对象维护出来的，用的LinkedHashMap