package com.startjava.lesson_2_3_4.game;

class Player {
	private String name;
	private int number;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getEnteredNumbers() {
		return enteredNumbers;
	}

	public void setEnteredNumber(int[] enteredNumbers) {
		this.enteredNumbers = enteredNumbers;
	}
}
