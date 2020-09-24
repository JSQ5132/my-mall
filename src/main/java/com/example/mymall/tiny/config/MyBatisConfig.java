package com.example.mymall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author 蒋圣强
 * @date 2020/09/23
 */
@Configuration
@MapperScan("com.example.mymall.tiny.mbg.mapper")
public class MyBatisConfig {
}
