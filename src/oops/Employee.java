package oops;

public class Employee {
int empid;
String empname;
int salary;
int deptno;

public void display()
{
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(salary);
    System.out.println(deptno);
}
public static void main(String[] args) {
	Employee emp=new Employee();
	 emp.empid=25;
	 emp.empname="asha";
	 emp.salary=20000;
	 emp.deptno=5;
	 emp.display();
	
}
}
