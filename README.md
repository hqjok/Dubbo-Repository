# Dubbo-Repository
my Dubbo Learning

（一）学习Dubbo的一个小Demo
1、定义Dubbo-interface 存放各种entity以及公用接口
2、user-service-provider1作为提供者
3、order-service-consumer1作为消费者
4、无论是提供者还是消费者都必须在启动类加上dubbo注解@EnableDubbo(scanBasePackages = "com.hqj.dubbo")
5、使用之前需安装zookeeper作为中间件，开放默认zookeeper端口2181
6、另外也可以上官网下载DubboAdmin管理中心和Monitor监控中心对服务更加具体的掌控

（二）provider端
1、在provider端显示三种配置方式：硬编码、application.yml和dubbo.properties(需配合@ImportResource注解)
2、在provider端还设置了两个version供消费者选择，分别由连个实现类实现
3、提供服务注解dubbo的@Service

（三）consumer端
1、在consumer端使用了本地存根，意义在于在本地判断数据格式，再进行远程调用服务，减少了服务端的压力；若数据格式错误直接返回null或错误
2、消费服务注解@Reference()可指定版本号，比如@Reference(version="1.0.0")

（四）其他配置项
1、check：布尔值，true关闭检查，false打开检查远程服务
2、timeout：设置超时时间，超时则不再连
①优先级：方法级<dubbo:method>  >  接口级<dubbo:refrence>  >  <dubbo:consumer>
②如何级别一样，消费方大于提供方
3、retries：重试次数，需要注意的是设置的次数不包含第一次
4、version：多版本
5、stub：本地存根
①本地存根需要设置构造方法，以便传入远程服务
②传值判断，更高效

（五）四种负载均衡机制自行测试
1、Random：按权重进行随机选择，权重大的选择的更多
2、RoundRobin：基于权重的轮询（哪台机器权重用完则不再用那台机器）
3、LeastActive：最少活跃数，记录哪台机器处理时间用得少，被选择几率更大
4、ConsistentHash：一致性哈希，根据约定的hash值进行机器选择
