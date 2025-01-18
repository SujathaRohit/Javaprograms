package javaBasics;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num= sc.nextInt();
		int temp=num;
		int sum=0;
		if(num<0) {
			System.out.println(temp+" is not a palindome (negative numbers are not considered palindromes)");
			return;
		}
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=(sum*10)+rem;
		}
		if(temp==sum) {
			System.out.println(temp+" is palindrome");
		}else {
			System.out.println(temp+ " is not palindrome");
		}
	}
}
