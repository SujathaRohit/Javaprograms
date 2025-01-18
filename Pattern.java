package javaBasics;
import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		
		for(int row=1; row<=rows;row++) {
			for(int i=1;i<=row;i++) {
			System.out.print("*" + " ");
		}
			System.out.println();
		}
		
	}
}
