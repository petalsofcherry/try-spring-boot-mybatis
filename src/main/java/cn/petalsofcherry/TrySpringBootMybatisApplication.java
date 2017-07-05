package cn.petalsofcherry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TrySpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrySpringBootMybatisApplication.class, args);
	}
}
