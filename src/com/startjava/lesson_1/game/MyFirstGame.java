package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int concealedNumber = 48;
		int minNum = 0;
		int maxNum = 100;
		
		int playerAnswer = (minNum + maxNum) / 2;
		System.out.println("Введите любое число от 0 до 100");
		while(concealedNumber != playerAnswer) {
			if(concealedNumber < playerAnswer) {
				maxNum = playerAnswer;
				System.out.println("Загаданное число меньше или больше " + maxNum);
			} else {
				minNum = playerAnswer;
				System.out.println("Загаданное число меньше или больше " + minNum);
			}
			playerAnswer = (minNum + maxNum) / 2;
		}
		System.out.println("Загаданное число = " + playerAnswer);
	}
}