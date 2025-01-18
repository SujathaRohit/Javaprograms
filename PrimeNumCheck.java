package javaBasics;
import java.util.Scanner;

public class PrimeNumCheck {
	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		//checking edge cases
		if(num<=1) {
			System.out.println(num+ " is not a Prime num");
			return;   // terminate the execution of the current method and return control to the point where the method was called.
		}
		boolean isPrime=true;
		
		for(int i=2; i<num; i++) {
			if(num%2==0) {
				isPrime=false;
				break;    //if any num divided by 2 -with break, if loop stops then for loop also stops
			}
		}
		if(isPrime) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime");
		}
		
	}
}
