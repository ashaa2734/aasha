package oops;

class parent
//method overriding
{
	//String name="abc";
	public void phone()
	{
		System.out.println("nokia");
	}
}

class Child extends parent
{
	public void phone()
	{
		//system.out.println(super.name);
		super.phone();
		System.out.println("iphone");
	}
}

public class Methodoverriding2 {
	
	public static void main(String[] args) {

      Child c=new Child();
      c.phone();
     
	}

}




 