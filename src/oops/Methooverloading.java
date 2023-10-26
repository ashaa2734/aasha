package oops;
//same name but arguments different

public class Methooverloading {
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
}
	public static void main(String[] args) {
		Methooverloading ov=new Methooverloading();
	ov.add(3,4);
	ov.add(5,6,7);
}
}

