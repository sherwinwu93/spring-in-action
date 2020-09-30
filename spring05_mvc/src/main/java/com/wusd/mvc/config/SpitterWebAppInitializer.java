package com.wusd.thymeleaf.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 只需要继承AbstractAnnotationConfigDispatcherServletInitializer, 就配置了ApplicationContext和DispatchedServlet
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        //将DispatcherServlet映射到"/"
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //指定配置类
        return new Class[]{WebConfig.class};
    }
}
