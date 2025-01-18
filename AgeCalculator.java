package javaBasics;
import java.util.Scanner;

public class AgeCalculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age: ");
	int age=sc.nextInt();
	if(age>=18) {
		System.out.println("Your eligible for vote");
	}else {
		System.out.println("Not eligible sorry!");
	}
	
}
}
