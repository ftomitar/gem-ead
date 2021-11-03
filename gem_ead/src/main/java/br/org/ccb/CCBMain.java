package br.org.ccb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan("br.org.ccb")
@SpringBootApplication
public class CCBMain{
	public static void main(String[] args) {
		SpringApplication.run(CCBMain.class, args);
	}
}
