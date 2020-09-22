package com.algorithm.appscrip;

import java.util.Scanner;

public class RemoveUnnecessarySpace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a sentance: ");
		String sentance = sc.nextLine();
		if (sentance.length() == sentance.trim().length()) {
			System.out.println(sentance);
		}else {
			System.out.println( sentance.trim().replaceAll("\\s+", " ") );
		}
		sc.close();
		
	}

}
