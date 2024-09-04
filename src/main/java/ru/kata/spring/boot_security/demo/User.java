package ru.kata.spring.boot_security.demo;

public class User {
	private Long id;
	private String name;
	private String lastName;
	private Byte age;
	
	public User(long l, String james, String brown, byte b) {
		this.id = l;
		this.name = james;
		this.lastName = brown;
		this.age = b;
	}
	
	// Геттеры и сеттеры
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	
	public Byte getAge() { return age; }
	public void setAge(Byte age) { this.age = age; }
}
