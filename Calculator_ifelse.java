package javaBasics;
import java.util.Scanner;

public class Calculator_ifelse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Enter an operator '+', '-', '*', '/', '%' to perform arithematic operations");
		char ch= sc.next().charAt(0);
		
		int result;
		
		if(ch== '+') {
			result=a+b;
			System.out.println(result);
		}
		else if(ch== '-'){
			result=a-b;
			System.out.println(result);
		}
		else if(ch== '*'){
			result=a*b;
			System.out.println(result);
		}
		else if(ch== '/'){
			result=a/b;
			System.out.println(result);
		}
		else if(ch== '%'){
			result=a%b;
			System.out.println(result);
		}else {
			System.out.println("You selected invalid operator. Please try again!!");
		}
	}
}
