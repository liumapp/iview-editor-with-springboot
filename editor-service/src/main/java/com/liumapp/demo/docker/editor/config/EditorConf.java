package com.liumapp.demo.docker.editor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liumapp
 * @file EditorConf.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/11/18
 */
@Configuration
public class EditorConf extends WebMvcConfigurerAdapter{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowCredentials(true);
    }

}
