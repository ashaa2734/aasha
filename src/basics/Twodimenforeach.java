package basics;

import java.util.Scanner;

public class Twodimenforeach {

	public static void main(String[] args) {
		int ar[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
			
			}
		System.out.println("entered values are");
		for(int a[]:ar)
		{
			for(int v:a)
			{
				System.out.print(v+" ");
			}
			System.out.println();
			}
		}
				

	}


