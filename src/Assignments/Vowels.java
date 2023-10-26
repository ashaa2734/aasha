package Assignments;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String str;
		char ch;
	      int len, i, vowel=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the string");
	      str = sc.nextLine();
	      
	      len = str.length();
	      for(i=0; i<len; i++)
	      {
	         ch = str.charAt(i);
	      
	      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	      vowel++;
	      }
	      System.out.println("\nTotal Vowels = " +vowel);
	      }
	}
