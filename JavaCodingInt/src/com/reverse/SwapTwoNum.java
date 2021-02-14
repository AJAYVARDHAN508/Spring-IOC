package com.reverse;

public class SwapTwoNum {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping values are.. "+a+"  "+b);
		
		//Logic1 - Third variable
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping Values are.."+a+"  "+b);
		
		//Logic 2 - Use + or - Without Using Third Variable
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("After Swapping Values are.."+a+"  "+b);
		
		//Logic3 - Use * and /  Without Using Third Variable
		a=a*b; // 10*20=200
		b=a/b; // 200/20=10
		a=a/b; // 200/10=20
		System.out.println("After Swapping Values are.."+a+"  "+b);
		
		// Logic4 bitwise XOR(^)
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Values are.."+a+"  "+b);
		
		//Logic5 Single Statement
	    b=a+b-(a=b);
		System.out.println("After Swapping Values are.."+a+"  "+b);
  }
}