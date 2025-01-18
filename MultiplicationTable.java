package javaBasics;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter nums from 1 to 10 to display multiplication table");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+ " x " +i+ " = "+ n*i);
		}
	}
}
