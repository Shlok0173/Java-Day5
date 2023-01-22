package Ajit;

import java.util.Scanner;

//Basic core program
//Ques-8
//Java Program to Check Whether a Number is Even or Odd
public class Evenorodd {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		//Get value by user
		int num=scanner.nextInt();
		//Check the remender is 0 or not
		if(num%2==0) {
			System.out.println("Given number is Even.. ");
		}else {
			System.out.println("Given number is Odd..");
		}
	}

}
