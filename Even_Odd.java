package javaBasics;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("Please enter possitive values from 1");
		}
		else if(num%2==0) {
			System.out.println("Even num");
		}else {
			System.out.println("Odd num");
		}
}
}
