package com.example.springbootswagger.javainuse;

//version 1
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SwaggerSpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringDemoApplication.class, args);
    }
}
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
        public class SwaggerSpringDemoApplication {
        public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringDemoApplication.class, args);
    }
}


