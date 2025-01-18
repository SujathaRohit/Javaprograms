package javaBasics;


public class SumOfDigits {
	public static void main(String[] args) {
		int num=45;
		int sum=0;
		while(num>0) {
			
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
