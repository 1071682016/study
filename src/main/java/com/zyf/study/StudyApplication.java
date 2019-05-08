package com.zyf.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.zyf.study"})
@RestController
@MapperScan("com.zyf.study.dao")
public class StudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

}
