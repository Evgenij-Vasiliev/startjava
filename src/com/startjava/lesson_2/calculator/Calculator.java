package com.startjava.lesson_2.calculator;


class Calculator {
	
	private int num1;
	private int num2;
	private char sign;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign; 
	}

	void calculate() {
		switch(sign) {
			case '+':
				System.out.println("Сумма = " + (num1 + num2));
				break;
			case '-':
				System.out.println("Разность = " + (num1 - num2));
				break;
			case '*':
				System.out.println("Произведение = " + (num1 * num2));
				break;
			case '/':
				System.out.println("Частное = " + (num1 / num2));
				break;
			case '%':
				System.out.println("Остаток от деления = " + (num1 % num2));
				break;
			case '^':
				int result = 1;
				for(int j = 1; j <= num2; j++) {
					result *= num1;
				}
				System.out.println("Результет возведения числа " + num1 + " в степень " + num2 + " = " + result);
		}
	}
}	