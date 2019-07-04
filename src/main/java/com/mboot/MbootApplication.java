package com.mboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.mboot.dao")
@SpringBootApplication
public class MbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbootApplication.class, args);
	}

}
