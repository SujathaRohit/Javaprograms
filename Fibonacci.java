package javaBasics;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Enter possitive num");
			return;
		}
		int n1=0, n2=1;
		for(int i=1;i<=n;i++) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
