package com.startjava.lesson_2.wolf;

class Wolf {
	private String gender;
	private String nickname;
	private String color;
	private int weight;
	private int age;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}  

	public void go() {
		System.out.println("идти");
	}

	public void sit() {
		System.out.println("сидеть");
	}

	public void run() {
		System.out.println("бежать");
	}

	public void howl() {
		System.out.println("выть");
	}
	
	public void hunt() {
		System.out.println("охотиться");
	}
}