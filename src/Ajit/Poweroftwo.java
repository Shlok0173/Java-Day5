package Ajit;
//Basic core programs
//Ques-3
//power of Two(2).
public class Poweroftwo {
           public static void main(String args[]) {
        	   int num;
        	   int mul=1;
        	   num=Integer.parseInt(args[0]);
        	   if(num>=0 && num<31) {
        		   System.out.println(mul);
        		   for(int i=1;i<num;i++)
        		   {
        			   mul=mul*2;
        			   System.out.println(mul);
        		   }
        	   }
        	   else {
        		   System.out.println("value of number should be less than 31");
        	   }
           }
}
