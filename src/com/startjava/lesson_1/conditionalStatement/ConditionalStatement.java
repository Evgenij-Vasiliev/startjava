package com.startjava.lesson_1.conditionalStatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 58;
		if(age > 20) {
			System.out.println("Вы все еще молоды");
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("Да Вы же мужчина!");
		}
		if(!isMale) {
			System.out.println("Нет, ВЫ не мужчина!");
		}

		float height = 1.86f;
		if(height < 1.80) {
			System.out.println("Вы ниже среднего роста");
		} else {
			System.out.println("ВЫ высокий");
		}

		char firstNameLetter = 'E';
		if(firstNameLetter == 'M') {
			System.out.println("То, возможно, Вас зовут Михаил");
		} else if(firstNameLetter == 'C') {
			System.out.println("Возможно Вы Степан");
		} else {
			System.out.println("Значит Вы Евгений");
		}
	}
}