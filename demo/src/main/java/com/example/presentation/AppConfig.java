package com.example.presentation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.dao", "com.example.metier" })
public class AppConfig {
}
