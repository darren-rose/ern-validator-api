package net.ddex.ern.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "net.ddex.ern")
@PropertySource("classpath:application.properties")
public class AppConfig {}
