package com.xxx.yyy.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
@Configuration//必须有，否则这个类里的实例都不会初始化
public class MybatisPlusConfig {
	/**
	 * 分页插件
	 * @return
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
	
	/**
	 * 此插件是SQL性能管理插件，但也有控制台打印sql的功能，红字Execute SQL
	 * 具体的日志打印也可以在yml文件配置org.apache.ibatis.logging.stdout.StdOutImpl 
	 * @return
	 */
	@Bean
//	@Profile("dev")//指定初始化bean的环境
	public PerformanceInterceptor performanceInterceptor() {
		PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
		performanceInterceptor.setMaxTime(3000);//ms,超时报错。
		performanceInterceptor.setFormat(true);
		return performanceInterceptor;
	}
}
