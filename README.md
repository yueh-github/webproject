## 项目简介

#### 此web项目为简单的一个springmvc + spring + mybatis示例

##### 支持jsp与freeMarker模板引擎

## web.xml 详解
### spring mvc 在web容器的配置
`<!-- 配置springmvc -->
<servlet>
    <servlet-name>springmvc</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:spring/spring-mvc.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
    <async-supported>true</async-supported>
</servlet>`

##### DispatcherServlet是前端控制器，不参与业务操作。 DispatcherServlet本质上是一个Servlet，生命周期包括init和service方法，前者实现应用程序初始化，后者实现对用户request的侦听和处理。

`<!--为DispatcherServlet建树映射 -->
<servlet-mapping>
    <servlet-name>springmvc</servlet-name>
    <url-pattern>/</url-pattern>
</servlet-mapping>`

##### 这个servlert-mapping的主要作用的是拦截/下面的所有请求交给springmvc的这个servlet来处理

`  <servlet-mapping>  
          <servlet-name>sampleSeverlet</servlet-name>  
          <url-pattern>*.do</url-pattern>  
  </servlet-mapping>  `
#####  你在一个页面中输入了一些信息,提交到a.do,那么sampleServlet就会截获这个请求,你可以在sampleServlet中做任何你想做的处理。


### spring 在web容器的配置
`<!-- 配置spring -->
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>
classpath:spring/spring-applicationContext.xml
</param-value>
</context-param>`

##### 上面的代码是指定了需要在web容器加载的spring文件

`<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>`

##### ContextLoaderListener监听器的作用就是启动Web容器时,自动装配ApplicationContext的配置信息，也就是说加载spring




## springmvc.xml的配置

`
<context:component-scan base-package="com.caimao.controller" />`

##### 配置 controller的注解，如果没配置的话会找不到对应的controller

`<bean id="viewResolverJsp" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/"/>
    <property name="suffix" value=".jsp"/>
    <property name="viewClass" value="org.springframework.web.servlet.view.InternalResourceView"/>
    <property name="order" value="1"/>
</bean>`

##### jsp视图解析器，会默认去/WEB-INF/下面寻找返回的viewName，生成.jsp后缀，order是解析器的顺序,order值越低，则优先级越高











