package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		char sign = '^';
				
		if(sign == '+') {
			System.out.println("Сумма = " + (num1 + num2));				
		} else if(sign == '-') {
			System.out.println("Разность = " + (num1 - num2));
		} else if(sign == '*') {
			System.out.println("Произведение = " + (num1 * num2));
		} else if(sign == '/') {
			System.out.println("Частное = " + (num1 / num2));
		} else if(sign == '%') {
			System.out.println("Остаток от деления = " + (num1 % num2));
		} else if(sign == '^') {
			int result = 1;
			for(int j = 1; j <= num2; j++) {
				result *= num1;
			}
			System.out.println("Результет возведения числа " + num1 + " в степень " + num2 + " = " + result);
		}
	}
}