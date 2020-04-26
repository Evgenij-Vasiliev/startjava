package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}
		System.out.println();

		int j = 10;
		do {
			j++;
			if(j % 2 != 0) {
				System.out.print(j + " ");
			} 
		} while(j < 20); 	
	}
}