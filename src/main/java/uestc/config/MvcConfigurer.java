package uestc.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {


    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }
}
