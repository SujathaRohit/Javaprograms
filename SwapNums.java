package javaBasics;

public class SwapNums{
	public static void main(String[] args) {
		//Without using 3rd variable
		int x=10, y=20;
		System.out.println("Before Swapping: "+ "x: " + x +" y: "+ y);
		//Without using 3rd variable
		/*
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping: "+ "x:" + x +" y: "+ y);
		*/
		
		//With 3rd variable
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping: "+ "x:" + x +" y: "+ y);
	}
}