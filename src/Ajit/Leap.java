package Ajit;

import java.util.Scanner;
// Basic program
//Qyes-2
/*a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.*/
public class Leap {
     public static void main(String args[]) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter the number:");
    	 int num=scanner.nextInt();
    	 // Get input by user
    	  
    	 // Determine if it is a Leap Year.
    	 if(num%4==0) {
    		 System.out.println("Leap year");
    	 }else {
    		 System.out.println("Not leap year");
    	 }
     }
}
