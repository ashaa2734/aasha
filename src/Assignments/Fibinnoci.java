package Assignments;

import java.util.Scanner;

public class Fibinnoci {

	public static void main(String[] args) {
		int a=0,b=1,c=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		System.out.println("The Fibinnoci series is "+a+" "+b);
		c=a+b;
		while(c<=n)
		{
			System.out.print(+c);
			a=b;
			b=c;
			c=a+b;
			System.out.println();
			
		}

	}

}
