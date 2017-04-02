package com.g0ng0n.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by g0ng0n.
 */
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void  main (String[] args){
        SpringApplication.run(AppConfig.class, args);

    }
}