package javaBasics;
import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1==n2 && n2==n3) {
			System.out.println("All numbers are equal");
		}
		else if(n1>=n2 && n1>=n3) {
			System.out.println(n1+" is larger");
		}else if(n2>=n1 && n2>=n3) {
			System.out.println(n2+" is larger");
		}else {
			System.out.println(n3+" is larger");
		}
	}
}
