package oops;
class Member
{
	String name;
	int age;
	String address;
	int salary;
public void printdetails()
{
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("address="+address);
   System.out.println("salary="+salary);
}
	}

 class worker extends member
 {

	String specialization;
	}	

class Manager extends member{

String department;

}

public class memberdetails {

	public static void main(String[] args) {
		Worker w1=new Worker();
		w1.name="asha";
		w1.age=25;
		w1.address="vipanchika";
		w1.salary=20000;
		w1.printdetails();
		manager m2=new manager();
		m2.name="anu";
		m2.age=28;
		m2.address="asfdfg";
		m2.salary=25000;
		m2.printdetails();
	}
	}
		