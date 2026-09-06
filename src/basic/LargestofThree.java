package basic;

import java.util.Scanner;

public class LargestofThree {
	
	public static void largestof3(int num1, int num2, int num3) {
		if(num1>num2&&num1>num3) {
			System.out.println("The largest is "+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("The largest is "+num2);
		}else {
			System.out.println("The largest is "+num3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		largestof3(num1,num2,num3);
		
		sc.close();

	}

}
