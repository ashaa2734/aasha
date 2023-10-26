package oops;
//single inheritance
	class Dog
	{
		public void eating()
		{
			System.out.println(" dog is eating");
		}
	}
	
class cat extends Dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}

public class SingleIInheritance {

	public static void main(String[] args) {
		cat ob=new cat();
		ob.sleeping();
		ob.eating();
	}

}
