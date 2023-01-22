package Ajit;

import java.util.Scanner;

// Basic core programs
// Ques-9
//java program to check Whether an Alphabet is vowel or Constant..
public class CheckAlphabet {
 public static void main(String[] args) {
	 char ch;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the alphabet");
		ch=scanner.next().charAt(0);
		if(ch =='a'|| ch == 'e'|| ch =='i'|| ch =='o'|| ch =='u'|| ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch=='U') {
		System.out.println("this is vowel");	
		}else {
			System.out.println("this is consonant");
		}
 }
}
