启动client
启动server

本地模拟中不使用eureka，独立使用feign调用第三方接口形式
这里server模拟第三方接口，由client调用

client
  访问地址
    http://localhost:8080/user/getUser
	
	
server
   访问地址 
     http://localhost:8090/test/getUserPage
     
    
issue
  在整合中遇到了一些小坑，我在自己的博客中进行了整理
  https://blog.csdn.net/shmily_lsl/article/details/101519273
