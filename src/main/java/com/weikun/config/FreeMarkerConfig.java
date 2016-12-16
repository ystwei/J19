package com.weikun.config;

import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import freemarker.template.Configuration;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/16.
 */
@org.springframework.context.annotation.Configuration
public class FreeMarkerConfig {
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Bean
    public Configuration getFreeMarkerConfiguration(){
        return freeMarkerConfigurer.getConfiguration();
    }

    public void resolveMap(Map<String,String> model, String templateName){
        try {
            Template temp=this.getFreeMarkerConfiguration().getTemplate(templateName);
            temp.process(model,new OutputStreamWriter(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
