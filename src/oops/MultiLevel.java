package oops;
//multilevele inheritance
class Doga
{
	public void eating()
	{
		System.out.println("Doga is eating");
	}
}
class cata extends Doga
{
	public void sleeping()
	{
		System.out.println("cata is sleeping");
	}
}
class Lion extends cata
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		cata ob=new cata();
		ob.eating();
		ob.sleeping();
		Lion li=new Lion();
		li.eating();
		li.sleeping();
		li.running();

	}

}
