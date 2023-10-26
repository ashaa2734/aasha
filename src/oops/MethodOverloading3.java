package oops;
//overload by changing the order of parameters
public class MethodOverloading3 {
public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a, int b)
{
	double d=a+b;
	System.out.println(d);
	
}
	public static void main(String[] args) {
		MethodOverloading3 ob=new MethodOverloading3();
		ob.add(5, 6.8);
		ob.add(3.9,9);
	}

}
