package com.xxx.yyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication//初始化启动类注解
@MapperScan(basePackages = "com.xxx.yyy.dao")//通过使用@MapperScan可以指定要扫描的Mapper类的包的路径，相当于统一添加@Mapper
@EnableScheduling//定时任务
@EnableSwagger2
@ComponentScan(basePackages = {"com.xxx"})
/**
 * 启动，初始化
 * @author fexia
 *
 */
public class ItegrationInit {
	public static void main(String[] args) {
		SpringApplication.run(ItegrationInit.class, args);
	}
}
