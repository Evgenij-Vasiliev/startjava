package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
		System.out.println("У каждого игрока 10 попыток");
		concealedNumber = (int)(Math.random() * 100);
		for(int count = 0; count < 10; count++) {
			System.out.println(playerOne.getName() + " назовите число: ");
			playerOne.setNumber(scan.nextInt());
			playerOne.arrayOne[count] = playerOne.getNumber();
			System.out.println(playerOne.getName() + " назвал число: " + playerOne.getNumber());
			if(playerOne.getNumber() > concealedNumber) {
				System.out.println("Ваше число " + playerOne.getNumber() + " больше загаданного, " +
						"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
				if(count == 9) {
					System.out.println(playerOne.getName() + " у Вас закончились попытки");
				}
			} else if(playerOne.getNumber() < concealedNumber) {
				System.out.println("Ваше число " + playerOne.getNumber() + " меньше загаданного, " +
						"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
				if(count == 9) {
					System.out.println(playerOne.getName() + " у Вас закончились попытки");
				}
			} else {
				System.out.println(playerOne.getName() + " Вы угадали, загаданное число " + concealedNumber +
						" с(со) " + (count + 1) + " попытки" );
				System.out.print("Все числа, которые ввел " + playerOne.getName() + " - " );
				//for(int i = 0; i < 10; i++) {
				//System.out.print(playerOne.arrayOne[i] + "; ");
				//}
				int[] arrayOneCopy = Arrays.copyOf(playerOne.arrayOne, (count + 1));
				System.out.println(Arrays.toString(arrayOneCopy));
				Arrays.fill(arrayOneCopy, 0);
				//System.out.println();
				//System.out.println(Arrays.toString(arrayOneCopy));
				System.out.print("Все числа, которые ввел " + playerTwo.getName() + " - " );
				//for(int i = 0; i < 10; i++) {
				//System.out.print(playerTwo.arrayTwo[i] + "; ");
				//}
				int[] arrayTwoCopy = Arrays.copyOf(playerTwo.arrayTwo, count);
				System.out.println(Arrays.toString(arrayTwoCopy));
				Arrays.fill(arrayTwoCopy, 0);
				//System.out.println();
				//System.out.println(Arrays.toString(arrayTwoCopy));
				break;
			}
			System.out.println(playerTwo.getName() + " назовите число: ");
			playerTwo.setNumber(scan.nextInt());
			playerTwo.arrayTwo[count] = playerTwo.getNumber();
			System.out.println(playerTwo.getName() + " назвал число: " + playerTwo.getNumber());
			if(playerTwo.getNumber() > concealedNumber) {
				System.out.println("Ваше число " + playerTwo.getNumber() + " больше загаданного, " +
						"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
				if(count == 9) {
					System.out.println(playerTwo.getName() + " у Вас закончились попытки");
				}
			} else if(playerTwo.getNumber() < concealedNumber) {
				System.out.println("Ваше число " + playerTwo.getNumber() + " меньше загаданного, " +
						"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
				if(count == 9) {
					System.out.println(playerTwo.getName() + " у Вас закончились попытки");
				}
			} else {
				System.out.println(playerTwo.getName() + " Вы угадали, загаданное число " + concealedNumber +
						" с(со) " + (count + 1) + " попытки");
				System.out.print("Все числа, которые ввел " + playerTwo.getName() + " - " );
				//for(int i = 0; i < 10; i++) {
				//System.out.print(playerTwo.arrayTwo[i] + "; ");
				//}
				int[] arrayTwoCopy = Arrays.copyOf(playerTwo.arrayTwo, (count + 1));
				System.out.println(Arrays.toString(arrayTwoCopy));
				Arrays.fill(arrayTwoCopy, 0);
				//System.out.println();
				//System.out.println(Arrays.toString(arrayTwoCopy));
				System.out.print("Все числа, которые ввел " + playerOne.getName() + " - " );
				//for(int i = 0; i < 10; i++) {
				//System.out.print(playerOne.arrayOne[i] + "; ");
				//}
				int[] arrayOneCopy = Arrays.copyOf(playerOne.arrayOne, (count + 1));
				System.out.println(Arrays.toString(arrayOneCopy));
				Arrays.fill(arrayOneCopy, 0);
				//System.out.println();
				//System.out.println(Arrays.toString(arrayOneCopy));
				break;
			}
		}
	}
}