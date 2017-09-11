package com.afternoonsept.SeptFirstSpring;

import com.afternoonsept.SeptFirstSpring.impl.StuImpl;
import com.afternoonsept.SeptFirstSpring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SeptFirstSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(SeptFirstSpringApplication.class, args);
	}
}
