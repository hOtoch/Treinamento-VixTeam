package com.example.hugo;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@org.springframework.context.annotation.Configuration

public class Configuration implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/form").setViewName("forward:/form.html"); // Adicionando um redirecionamento de localhost:8080/hello para um HTML "form.html"
        registry.addViewController("/login").setViewName("forward:/login.html");
    }



}
