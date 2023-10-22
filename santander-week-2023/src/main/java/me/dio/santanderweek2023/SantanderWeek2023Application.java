package me.dio.santanderweek2023;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SantanderWeek2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderWeek2023Application.class, args);
	}

}
