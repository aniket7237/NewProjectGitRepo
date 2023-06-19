package com.test;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = scan.nextInt();
		//int n= 5 ;
		for(int i =5 ; i>1 ; i--) {
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
