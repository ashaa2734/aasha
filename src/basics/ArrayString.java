package basics;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		String arr[]=new String[4];
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter ur names:");
		for(int i=0;i<4;i++)
		{
			arr[i]=Sc.next();
		}
		System.out.println("the name is");
		for(String s:arr)
		{
			System.out.println(s);
		}
		}
				;

	}


