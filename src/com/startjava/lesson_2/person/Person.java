package com.startjava.lesson_2.person;

class Person {
	String name = "Марк";
	String gender = "мужской";
	float height = 1.98f;
	int weight = 92;
	int age = 27;

	void go() {
		System.out.println("Вы умеете ходить");
	}

	void sit() {
		System.out.println("Вы можете сидеть");
	}

	void run() {
		System.out.println("Бежим");
	}

	void speak() {
		System.out.println("Скажите что нибудь");
	}
	
	void learnJava() {
		System.out.println("Вы изучаете Java");
	}
}