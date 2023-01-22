package Ajit;

import java.util.Scanner;

//Basic core programs
//ques.6
// java program to computer Quotient and Remainder.
public class QuotientRemainder {
     public static void main(String[]args) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter Divided number:");
    	 int divided=scanner.nextInt();
    	 
    	 System.out.println("Enter Divisor number:");
    	 int divisor=scanner.nextInt();
    	 
    	 int quotient=divided/divisor;
    	 int remainder=divided%divisor;
    	 
    	 System.out.println("The Quotient is ="+quotient);
    	 System.out.println("The Remainder is="+remainder);
     }
}
