package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
	Scanner scan = new Scanner(System.in);
	Player playerOne;
	Player playerTwo;
	int concealedNumber;
	int count;

	public void numberInput(Player player) {
		System.out.println(player.name + " назовите число: ");
		player.number = scan.nextInt();
		System.out.println(player.name + " назвал число: " + player.number);
	}

	public  void compare(Player player) {
		if(player.getNumber() > concealedNumber) {
			System.out.println("Ваше число " + player.getNumber() + " больше загаданного, " +
					"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
			if (count == 9) {
				System.out.println(player.getName() + " у Вас закончились попытки");
			}
		} else if(player.getNumber() < concealedNumber) {
			System.out.println("Ваше число " + player.getNumber() + " меньше загаданного, "+
					"у Вас осталось " + (10 - 1 - count) + " попыток(ки, ка)");
			if (count == 9) {
				System.out.println(player.getName() + " у Вас закончились попытки");
			}
		} else {
			System.out.println(player.getName() + " Вы угадали, загаданное число " + concealedNumber +
					" с(со) " + (count + 1) + " попытки");

			System.out.print("Все числа, которые ввел " + playerOne.getName() + " - ");
			int[] arrayOneCopy = Arrays.copyOf(playerOne.getEnteredNumbers(), (count + 1));
			System.out.println(Arrays.toString(arrayOneCopy));
			Arrays.fill(arrayOneCopy, 0);
			System.out.print("Все числа, которые ввел " + playerTwo.getName() + " - ");
			int[] arrayTwoCopy = Arrays.copyOf(playerTwo.getEnteredNumbers(), count);
			System.out.println(Arrays.toString(arrayTwoCopy));
			Arrays.fill(arrayTwoCopy, 0);
		}
	}

	GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame () {

		System.out.println("Начало игры");
		System.out.println("Компьютер загадает число от 0 до 100 ");
		System.out.println("игроки по очереди будут пытаться угадать число, загаданное компьютером");
		System.out.println("У каждого игрока 10 попыток");
		concealedNumber = (int) (Math.random() * 100);

		for (count = 0; count < 10; count++) {
			numberInput(playerOne);
			compare(playerOne);
			if(playerOne.getNumber() == concealedNumber) {
				break;
			}
			numberInput(playerTwo);
			compare(playerTwo);
			if(playerTwo.getNumber() == concealedNumber) {
				break;
			}
		}
	}
}
