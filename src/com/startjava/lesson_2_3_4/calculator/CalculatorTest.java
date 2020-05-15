package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		while(answer.equals("yes")) {
			System.out.println("Введите первое число: ");
			calc.setNum1(scan.nextInt());
			System.out.println("Введите знак математической операции: ");
			calc.setSign(scan.next().charAt(0));
			System.out.println("Введите второе число: ");
			calc.setNum2(scan.nextInt());
			calc.calculate();
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} 
	}
}
