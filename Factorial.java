package javaBasics;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a num");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
