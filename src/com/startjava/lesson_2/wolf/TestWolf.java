package com.startjava.lesson_2.wolf;

class TestWolf {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.setGender("мужской");
		System.out.println(wolf.getGender());
		wolf.setNickname("Трой");
		System.out.println(wolf.getNickname());
		wolf.setColor("черный");
		System.out.println(wolf.getColor());
		wolf.setWeight(52);
		System.out.println(wolf.getWeight());
		wolf.setAge(9);
		System.out.println(wolf.getAge());

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}