package basic;

import java.util.Scanner;

public class Swap2Numbers {
	
	public static void swapWithTemp(int num1, int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("First number after swap is "+num1);
		System.out.println("Second number after swap is "+num2);
	}
	
	public static void swapWithoutTemp(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("First number after swap is "+num1);
		System.out.println("Second number after swap is "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		swapWithTemp(num1, num2);
		swapWithoutTemp(num1, num2);
		
		sc.close();

	}

}
