package Assignments;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		int num,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	     num=sc.nextInt();
	     for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
		}

if(count==0)
    System.out.println("\nIt is a Prime Number.");
 else
    System.out.println("\nIt is not a Prime Number.");
}
}

