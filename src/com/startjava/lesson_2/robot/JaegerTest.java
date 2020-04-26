package com.startjava.lesson_2.robot;

class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger(); 
		
		System.out.println("ПЕРВЫЙ ЕГЕРЬ");
		jaegerOne.setModelName("Cherno Alpha");
		System.out.println("Название модели егеря: " + jaegerOne.getModelName());
		jaegerOne.setMark("Mark-1");
		System.out.println("Поколение: " + jaegerOne.getMark());
		jaegerOne.setOrigin("Russia");
		System.out.println("Сделано в " + jaegerOne.getOrigin());
		jaegerOne.setHeight(50.2f);
		System.out.println("Рост: " + jaegerOne.getHeight());
		jaegerOne.setWeight(5.7f);
		System.out.println("Вес: " + jaegerOne.getWeight());
		jaegerOne.setSpeed(1);
		System.out.println("Скорость: " + jaegerOne.getSpeed());
		jaegerOne.setStrenght(5);
		System.out.println("Причность: " + jaegerOne.getStrenght());
		jaegerOne.setArmor(6);
		System.out.println("Броня: " + jaegerOne.getStrenght());
		jaegerOne.drift();
		jaegerOne.move();
		System.out.println("Поиск Kaiju: " + jaegerOne.scanKaiju());
		jaegerOne.useVortexCannon();
		System.out.println();
		
		Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 78.7f, 2.4f, 3, 8, 9);

		System.out.println("ВТОРОЙ ЕГЕРЬ");
		//jaegerTwo.setModelName("Striker Eureka");
		System.out.println("Название модели егеря: " + jaegerTwo.getModelName());
		//jaegerTwo.setMark("Mark-5");
		System.out.println("Поколение: " + jaegerTwo.getMark());
		//jaegerTwo.setOrigin("Australia");
		System.out.println("Сделано в " + jaegerTwo.getOrigin());
		//jaegerTwo.setHeight(78.7f);
		System.out.println("Рост: " + jaegerTwo.getHeight());
		//jaegerTwo.setWeight(2.4f);
		System.out.println("Вес: " + jaegerTwo.getWeight());
		//jaegerTwo.setSpeed(3);
		System.out.println("Скорость: " + jaegerTwo.getSpeed());
		//jaegerTwo.setStrenght(8);
		System.out.println("Причность: " + jaegerTwo.getStrenght());
		//jaegerTwo.setArmor(9);
		System.out.println("Броня: " + jaegerTwo.getStrenght());
		jaegerTwo.drift();
		jaegerTwo.move();
		System.out.println("Поиск Kaiju: " + jaegerTwo.scanKaiju());
		jaegerTwo.useVortexCannon();
	}
}