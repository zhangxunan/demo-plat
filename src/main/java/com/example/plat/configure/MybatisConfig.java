package com.example.plat.configure;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.plat")
@MapperScan("com.example.plat.mapper")
public class MybatisConfig {
}
