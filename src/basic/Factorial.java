package basic;

import java.util.Scanner;

public class Factorial {
	
	public static int generateFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Input");
		int input=sc.nextInt();
		
		System.out.println("Factorial is "+generateFactorial(input));
		
		sc.close();
		

	}

}
