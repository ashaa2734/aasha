package basics;

import java.util.Scanner;

public class ScannerRc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //import scanner
		System.out.println("enter ur age");
		int age = sc.nextInt();
		System.out.println("enter ur name");
		String name=sc.next();
		System.out.println("enter a character");
		char c=sc.next().charAt(0);
		System.out.println("age is:"+age);
		System.out.println("name is:"+name);
		System.out.println("entered characyer is:"+c);
		
 
	}

}
