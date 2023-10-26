package oops;

public class EmpConstructor {

		//define class variables
		int empid;
		int salary;
		String designation;
		//constructor
		
		public EmpConstructor()
		{
			empid=111;
			salary=20000;
			designation="Tester";
		}
		//public void employee()
public static void main(String[]args) {
	EmpConstructor ob=new EmpConstructor();  //create obj to invoke constructor
	System.out.println(ob.empid);
	System.out.println(ob.salary);
	System.out.println(ob.designation);
	
	}

	}


