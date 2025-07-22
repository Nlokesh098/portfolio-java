package com.lokesh.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable() // allows POST requests from clients like Postman/curl
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/home", "/movie", "/movies").permitAll()
                        .anyRequest().authenticated()
                )
                .build();
    }
}