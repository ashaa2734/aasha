package Exam;

import java.util.Scanner;

public class classroom {
	
		int rollNo;
		String name;
		int Mark;
		
	public void assign() {
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter student name: ");
		name=sc.nextLine();
		System.out.print("Enter the rollno: ");
		rollNo=sc.nextInt();
		System.out.print("Enter marks: ");
		Mark=sc.nextInt();
		}
	public void display() {
		System.out.println("rollno:" +rollNo);
		System.out.println("name:" +name);
		System.out.println("mark:" +Mark);
	}
	public static void main(String[] args) {
		classroom student=new classroom();
		student.assign();
		student.display();
				
	}

	}
