package javaBasics;
import java.util.Scanner;

public class LeapYear {

	
	/*A year is a leap year if “any one of ” the following conditions are satisfied: 

The year is multiple of 400.
The year is a multiple of 4 and not a multiple of 100. */
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int year= sc.nextInt();
		if(year%400==0 || (year%4==0 && !(year%100==0))) {
			System.out.println(year+ " is leap year");
		}else {
			System.out.println(year+ " is not leap year");
		}
	}
}
