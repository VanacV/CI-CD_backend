package com.code_vanac.fullstack_backend;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Применяется ко всем путям
                .allowedOrigins(
                        "http://localhost:3000",
                        "https://ci-cdfrontend-production.up.railway.app") // Разрешенный домен
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Разрешенные методы
                .allowCredentials(true);
    }
}
