package javaBasics;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks: ");
		int marks=sc.nextInt();
		if(marks>=90 && marks<=100) {
			System.out.println("A Grade");
		}else if(marks>=75 && marks<=90) {
			System.out.println("Grade B");
		}else if(marks>=50 && marks<=75) {
			System.out.println("Grade C");
		}else if(marks<50 && marks>=0) {
			System.out.println("Fail");
		}else {
			System.out.println("Please enter marks beween 0 and 100 ");
		}
		
}
}
