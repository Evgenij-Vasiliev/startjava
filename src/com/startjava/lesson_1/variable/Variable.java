package com.startjava.lesson_1.variable;


public class Variable {
	public static void main(String[] args) {
		byte numberOfCores = 4;
		short usb = 7;
		int cpu = 3200;
		long ssd = 120031511;
		float bios = 2.4f;
		double controllerVersion = 255.255;
		char systemDisk	= 67;
		boolean powerSupply = false;

		System.out.println("Число ядер процессора = " + numberOfCores);
		System.out.println("Количество портов USB = " + usb);
		System.out.println("Частота процессора = " + cpu);
		System.out.println("Емкость SSD Kбайт = " + ssd);
		System.out.println("Версия BIOS: " + bios);
		System.out.println("Версия контроллера: " + controllerVersion);
		System.out.println("Системный диск: " + systemDisk);
		System.out.println("Электропитание включено: " + powerSupply);
	}
}