package Assignments;

import java.util.Scanner;

public class Largestnumarray {

	public static void main(String[] args) {
		int n, largestnum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i < n; i++)
		{
		a[i] = sc.nextInt();
		}
		largestnum = a[0];
		for(int i = 0; i < n; i++)
		{
		if(largestnum < a[i])
		{
		largestnum= a[i];
		}
		}
		System.out.println("largest number is :"+largestnum);
		}
}
