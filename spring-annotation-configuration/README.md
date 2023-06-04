# @Configuration 注解

@Configuration 是 Spring 中的一个注解,用于定义配置类。被该注解修饰的类会被 Spring 容器识别为一个 bean 定义的来源。

源码：org.springframework.context.annotation.Configuration

```java
@Target(ElementType.TYPE) // 表示 @Configuration 可以用于修饰类。
@Retention(RetentionPolicy.RUNTIME)// 表示 @Configuration 会被保留至运行时,可以通过反射读取。
@Documented // 表示在生成文档时,@Configuration 的信息会被包含进去。 
@Component // 表示被 @Configuration 修饰的类会被 Spring 识别为一个组件,并注册为 bean 至容器中。
public @interface Configuration {
	@AliasFor(annotation = Component.class)
	String value() default "";
  // 用于设置 @Configuration 修饰的类是否应代理 @Bean 方法。默认为 true,表示应代理。
	boolean proxyBeanMethods() default true;
  // 检测 @Configuration 修饰的类中是否存在重复的 @Bean 方法名。
	boolean enforceUniqueMethods() default true;
}
```

核心注解 @Component 注解,这使得 @Configuration 修饰的类本身也会被注册为一个 bean:

- 其 beanName 为类名首字母小写。
-  可以通过容器的 getBean() 方法或 @Autowired 注入等方式获取该 bean。 

## proxyBeanMethods 属性

proxyBeanMethods该属性用于设置 @Configuration 修饰的类是否应代理 @Bean 方法。默认为 true,表示应代理。

- 当设置为 true 时，@Bean 方法返回的 bean 会被 Spring 容器代理,并在每次请求时返回 同一个代理对象。
  可以使用 AOP 拦截 @Bean 方法及代理。
- 当设置为 false 时，@Bean 方法返回的 bean 将不会被代理,Spring 每次都会直接调用 @Bean 方法来返回新实例。
  无法使用 AOP 拦截 @Bean 方法,但是可以在返回的 bean 实例上应用 AOP 代理。

所以,proxyBeanMethods 的作用主要在于是否需要 Spring 为 @Bean 方法及其返回的 bean 应用代理,这在一定程度上影响了 AOP 的适用范围。


验证proxyBeanMethods属性的作用：[ConfigurationAnnotationTest.java](src%2Fmain%2Fjava%2Fcom%2Fspring%2Fannotation%2Fconfiguration%2FConfigurationAnnotationTest.java)

## 使用

1. 支持 @ConfigurationProperties。
2. 支持条件化配置，使用 @Conditional 注解进行条件化配置,实现按环境、属性等条件判断是否加载 bean 定义。
3. 支持 @ConfigurationPropertiesScan



