package basic;

import java.util.Scanner;

public class Add2Numbers {
	
	public static int add2Num(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter input number2");
		int num2=sc.nextInt();
		
		System.out.println("Their sum is "+add2Num(num1, num2));
		
		sc.close();

	}

}
