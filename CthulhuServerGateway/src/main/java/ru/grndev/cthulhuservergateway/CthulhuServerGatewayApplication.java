package ru.grndev.cthulhuservergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CthulhuServerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CthulhuServerGatewayApplication.class, args);
	}

}

/*
Валидация на уровне шлюза должна быть без обращений к бд. Как валидировать юзернейм и емаил?
 */