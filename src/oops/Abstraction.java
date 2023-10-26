package oops;

abstract class Google
{
	abstract void search();
	public void messages() 
	{
		System.out.println("thank u for using google");
	}
		
}

class searchAll extends Google
{

	@Override
	void search() {
		System.out.println("search details");
		
	}
	
}
class searchImage extends Google
{

	@Override
	void search() {
		System.out.println("image search results");
		
	}
	
}
class searchVideo extends Google
{

	@Override
	void search() {
		System.out.println("video search results");
		
	}
	
}
   public class Abstraction {

	public static void main(String[] args) {
		searchAll a=new searchAll();
		a.search();
		a.messages();
		searchImage i=new searchImage();
		i.messages();
		i.search();
		searchVideo v=new searchVideo();
		v.messages();
		v.search();

	}

}
