package Ajit;

import java.util.Scanner;
//Basic program 
//Ques 1
/*a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails*/
public class Coin {
     public static void main(String args[]) {
    	 // declaration
    	 int head=0;
    	 int tail=0;
    	 int i=1;
    	 
    	 //Get input from user
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter Number of time to flip the coin");
    	 int num=scanner.nextInt();
    	 
    	 // Check the condtion
    	 while(i<=num) {
    		 double a=Math.random();//check the random method
    		 if(a<0.5) {
    			 tail++;
    		 }else {
    			 head++;
    		 }
    		 i++;
    		 
    	 System.out.println("Random value:"+a);
    	 }
    	 System.out.println("Head ="+head);
    	 System.out.println("tail ="+tail);
    	 
    	 //calculating percentage for Head and tail
    	 int Headper=(head*100)/num;
    	 int Tailper=(tail*100)/num;
    	 
    	 System.out.println("HeadPercentage="+Headper);
    	 System.out.println("Tailpercentage="+Tailper);
    	 }
     }

