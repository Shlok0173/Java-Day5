package Ajit;

import java.util.Scanner;
//basic program
// Ques-10
//Java Program to Find the Largest Among Three Numbers.
public class Largest {
    public static void main(String args[]) {
    	Scanner scanner=new Scanner(System.in);
    	// get input by user
    	System.out.println("Enter the First Number:");
    	int num1=scanner.nextInt();
    	
    	System.out.println("Enter the Second Number:");
    	int num2=scanner.nextInt();
    	
    	System.out.println("Enter the Third Number:");
    	int num3=scanner.nextInt();
    	//Compare two value 
    	// 18>=16
    	if(num1>=num2 && num1>=num3) {
    		System.out.println("First number is largest:"+num1);
    	}else if(num2>=num1 && num2>=num3) {
    		System.out.println("Second number is largest:"+num2);
    	}else {
    		System.out.println("Third number is largest:"+num3);
    	}
    }
}
