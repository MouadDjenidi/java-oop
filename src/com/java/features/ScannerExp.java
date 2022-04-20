package com.java.features;

import java.util.Scanner;

public class ScannerExp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Hello you there, what's your name ");
		String name = scanner.nextLine();
		System.out.println(" nice meeting you "+name);
		System.out.println(" how old are you ? ");
		int age = scanner.nextInt();
		System.out.println("Oh that great you are younger than me ");
		System.out.println("how tall are you ?");
		
		float hight = scanner.nextFloat();
		if(hight <= 1.50) System.out.println("oh you are very short");
		else if(hight > 1.50 && hight < 1.79) System.out.println("oh you are tall");
		else System.out.println("oh you are very tall");
		System.out.println("it's time to go see you again "+name);
		
		scanner.close();
	}

}
