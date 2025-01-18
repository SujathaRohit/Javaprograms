package javaBasics;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("Please enter possitive num");
			return;
		}
		
		int sum=0;
		while(num>0) {
			int rem= num%10;
			num=num/10;
			sum=(sum*10)+rem;
		}
		System.out.println("Reverse of a num is: "+sum);
	}
}
