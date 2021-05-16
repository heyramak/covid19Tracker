package com.coronatracker.datahandle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataHandleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataHandleApplication.class, args);
	}

}
