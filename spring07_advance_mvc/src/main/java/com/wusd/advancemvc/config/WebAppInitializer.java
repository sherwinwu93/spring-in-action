package com.wusd.advancemvc.config;

import com.wusd.advancemvc.servlet.MyFilter;
import com.wusd.advancemvc.servlet.MyServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("myServlet", MyServlet.class);

        dynamic.addMapping("/custom/**");

        FilterRegistration.Dynamic myFilterDynamic = servletContext.addFilter("myFilter", MyFilter.class);
        myFilterDynamic.addMappingForUrlPatterns(null, false,"/custom/*");
    }

    //映射到DispatchServlet
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {new MyFilter()};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //处理文件上传
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
    }
}
