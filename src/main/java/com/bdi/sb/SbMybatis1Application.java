package com.bdi.sb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class})
@MapperScan({"com.bdi.sb.mapper"})
@PropertySource({"classpath:/env.properties"})
public class SbMybatis1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbMybatis1Application.class, args);
	}

}
