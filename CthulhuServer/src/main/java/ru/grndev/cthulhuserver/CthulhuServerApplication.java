package ru.grndev.cthulhuserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CthulhuServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CthulhuServerApplication.class, args);
	}

}

/**
 * Регистрация просто через логин/пароль. Разделы пользователей, разделы админов.
 * Обновление приложения на телефоне.
 * Оффлайн режим.
 * Логирование запросов к серверу и к БД.
 *
 * Возможность добавлять заметки?
 *
 *
 * Слой шлюза. Валидация.
 *
 * Кеширование для оффлейн режима?
 *
 *
 * проброс портов, указание постоянного локального Ip
 */
