package basic;

import java.util.Scanner;

public class OddOrEven {
	
	public static void oddOREven(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input");
		int input=sc.nextInt();
		oddOREven(input);
		
		sc.close();

	}

}
