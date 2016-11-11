//package cn.itcast.ssm.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * 2016-10-24 10:48
// */
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("cn.itcast.ssm.controller, cn.itcast.ssm.service,cn.itcast.ssm.mapper")
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        resolver.setExposeContextBeansAsAttributes(true);
//        return resolver;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//}
//
////public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
//
//
////
////    private ApplicationContext applicationContext;
////
////    public WebConfig() {
////        super();
////    }
////    public void setApplicationContext(final ApplicationContext applicationContext)
////            throws BeansException {
////        this.applicationContext = applicationContext;
////    }
////
////
//////    @Override
//////    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//////        super.addResourceHandlers(registry);
//////        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
//////        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//////        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//////    }
//////
//////    @Bean
//////    public ResourceBundleMessageSource messageSource() {
//////        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//////        messageSource.setBasename("Messages");
//////        return messageSource;
//////    }
//////
//////    @Override
//////    public void addFormatters(final FormatterRegistry registry) {
//////        super.addFormatters(registry);
//////        registry.addFormatter(varietyFormatter());
//////        registry.addFormatter(dateFormatter());
//////    }
//////
//////    @Bean
//////    public VarietyFormatter varietyFormatter() {
//////        return new VarietyFormatter();
//////    }
//////
//////    @Bean
//////    public DateFormatter dateFormatter() {
//////        return new DateFormatter();
//////    }
////
////    @Bean
////    public SpringResourceTemplateResolver templateResolver(){
////        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
////        templateResolver.setApplicationContext(this.applicationContext);
////        templateResolver.setPrefix("/WEB-INF/templates/");
////        templateResolver.setSuffix(".html");
////        templateResolver.setTemplateMode(TemplateMode.HTML);
////        templateResolver.setCacheable(true);
////        return templateResolver;
////    }
////
////    @Bean
////    public SpringTemplateEngine templateEngine(){
////        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////        templateEngine.setTemplateResolver(templateResolver());
////        templateEngine.setEnableSpringELCompiler(true);
////        return templateEngine;
////    }
////
////    @Bean
////    public ThymeleafViewResolver viewResolver(){
////        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
////        viewResolver.setTemplateEngine(templateEngine());
////        return viewResolver;
////    }
////}
//
//
