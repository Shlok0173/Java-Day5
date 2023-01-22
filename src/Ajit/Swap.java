package Ajit;

import java.util.Scanner;
// Basic program 
// Ques-7
//Java Program to Swap Two Numbers.
public class Swap {
      public static void main(String args[]) {
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("Enter The First Value:");
    		int x=scanner.nextInt();
    		// Get input by user
    		
    		System.out.println("Enter The Second Value:");
    		int y=scanner.nextInt();
    		
    		int z;
    		System.out.println("Before Swapping two number:"+x+y);
    		
    		// Swapping number
    		z=x;
    		x=y;
    		y=z;
    		
    		System.out.println("After Swapping two number:="+x+y);
    		
    
      }
}
