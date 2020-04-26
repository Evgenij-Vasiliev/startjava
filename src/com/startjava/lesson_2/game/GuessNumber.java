package com.startjava.lesson_2.game;

import java.util.Scanner;

class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;
	private int concealedNumber;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
		
	public void startGame() {
		System.out.println("Начало игры");
		System.out.println("Компьютер загадает число от 0 до 100 ");
		System.out.println("игроки по очереди будут пытаться угадать число, загаданное компьютером");
		concealedNumber = (int)(Math.random() * 101);
		do {
			System.out.println(playerOne.getName() + " назовите число: ");
			playerOne.setNumber(scan.nextInt());
			System.out.println(playerOne.getName() + " назвал число: " + playerOne.getNumber());
			if(playerOne.getNumber() > concealedNumber) {
				System.out.println("Ваше число больше загаданного ");
			} else if(playerOne.getNumber() < concealedNumber) {
				System.out.println("Ваше число меньше загаданного ");
			} else {
				System.out.println(playerOne.getName() + " Вы угадали, загаданное число: " + concealedNumber);
				break;
			}
			System.out.println(playerTwo.getName() + " назовите число: ");
			playerTwo.setNumber(scan.nextInt());
			System.out.println(playerTwo.getName() + " назвал число: " + playerTwo.getNumber());
			if(playerTwo.getNumber() > concealedNumber) {
				System.out.println("Ваше число больше загаданного ");
			} else if(playerTwo.getNumber() < concealedNumber) {
				System.out.println("Ваше число меньше загаданного ");
			} else {
				System.out.println(playerTwo.getName() + " Вы угадали, загаданное число: " + concealedNumber);
				break;
			}
		} while(true);
	}
}