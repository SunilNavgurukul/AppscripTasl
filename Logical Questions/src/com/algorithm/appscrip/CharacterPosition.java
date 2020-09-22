package com.algorithm.appscrip;

import java.util.Scanner;

public class CharacterPosition {

	public static void main(String[] args) {
		char[] small_alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character ");
		char c = sc.next().charAt(0);
		for (int i = 0; i < small_alphabets.length; i++) {
			if (small_alphabets[i] == Character.toLowerCase(c)) {
				System.out.println(i + 1);
				break;
			}

		}

		sc.close();
	}

}
