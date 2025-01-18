package javaBasics;
import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a numer greater than 0 to find out Even or add");
		int n= sc.nextInt();
		if(n<=0) {
			System.out.println("Enter a num greater than 0");
		}else {
			if(n%2==0) {
				System.out.println(n + " is even");
			}else {
				System.out.println(n + " is odd");
			}
		}
		sc.close();
	}
}