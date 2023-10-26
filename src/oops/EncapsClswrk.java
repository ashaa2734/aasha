package oops;
class Monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}

}
class Human extends Monkey implements BasicAnimal
{
	public void speak() {
		System.out.println("speak");
	}

	@Override
	public void cat() {
		System.out.println("cat is running");	
	}

	@Override
	public void sleep() {
		
		System.out.println("cat is sleeping");
	}
		
	}
	interface BasicAnimal{
		   public void cat();
		    public void sleep();
	
}
public class EncapsClswrk {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.cat();
		ob.sleep();
		ob.speak();
		ob.bite();
		ob.jump();
		
	}
}

