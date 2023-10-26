package oops;

class Dogb
{
	public void eating()
	{
		System.out.println(" Dog is eating");
	}
}
class catb extends Dogb
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}
class Lionb extends Dogb
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
     catb ob=new catb();
     ob.eating();
     ob.sleeping();
     Lionb ob1=new Lionb();
     ob1.eating();
     ob1.running();
     
	}

}
