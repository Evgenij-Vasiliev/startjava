package com.startjava.lesson_2_3_4.game;

class Player {
	private String name;
	private int[] enteredNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getEnteredNumbers() {
		return enteredNumbers;
	}
}
