package com.pactera.spring.boo.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pactera.spring.boo.learn.mapper")
public class SpringBootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearnApplication.class, args);
	}

}
