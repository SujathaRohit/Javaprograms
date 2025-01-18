package javaBasics;

import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem= num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp) {  //it is not sum==num (Once you divide num by 10 repeatedly in the loop, it becomes 0, so the comparison (if(sum == num)) will always fail)
			System.out.println("It is Armstring number");
		}else {
			System.out.println("It is not Armstrong");
		}
	}
}
