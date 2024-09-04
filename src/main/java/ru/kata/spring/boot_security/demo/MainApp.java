package ru.kata.spring.boot_security.demo;

public class MainApp {
	public static void main(String[] args) {
		ApiClient apiClient = new ApiClient();
		
		// Шаг 1: Получить список всех пользователей
		apiClient.getAllUsers();
		
		// Шаг 2: Добавить нового пользователя
		User newUser = new User(3L, "James", "Brown", (byte) 25);
		apiClient.addUser(newUser);
		
		// Шаг 3: Изменить пользователя
		newUser.setName("Thomas");
		newUser.setLastName("Shelby");
		apiClient.updateUser(newUser);
		
		// Шаг 4: Удалить пользователя
		apiClient.deleteUser(3L);
		
		// Теперь вы можете соединить все части кода и использовать его для проверки на платформе
	}
}
