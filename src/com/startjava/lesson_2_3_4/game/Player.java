package com.startjava.lesson_2_3_4.game;

class Player {
	private String name;
	private int count;
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

	public int getCount() {
		return count;
	}

	public  void setCount(int count) {
		this.count = count;
	}

	public int[] getEnteredNumbers() {
		return enteredNumbers;
	}
}
