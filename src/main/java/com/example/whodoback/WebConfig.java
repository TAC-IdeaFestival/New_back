package com.example.whodoback;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://port-0-new-back-fao2flc73lma0.gksl2.cloudtype.app")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}