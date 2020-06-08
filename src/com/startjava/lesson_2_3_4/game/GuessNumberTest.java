package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Первый игрок введите Ваше имя: ");
		Player playerOne = new Player(scan.next());
		System.out.println("Первого играка зовут: " + playerOne.getName());
		System.out.println("Второй игрок введите Ваше имя: ");
		Player playerTwo = new Player(scan.next());
		System.out.println("Второго игрока зовут: " + playerTwo.getName());

		GuessNumber game = new GuessNumber(playerOne, playerTwo);

		String answer;
		do {
			game.startGame();
			System.out.println("Game over");
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}

