package com.example.hugo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class HelloWorld implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/form").setViewName("forward:/form.html"); // Adicionando um redirecionamento de localhost:8080/hello para um HTML "form.html"
    }

}
