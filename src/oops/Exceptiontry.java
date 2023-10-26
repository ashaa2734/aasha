package oops;

public class Exceptiontry {

	public static void main(String[] args) {
			int a=10,b=0;
			try
			{
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				
				System.out.println("arithmetic exception");
				System.out.println(e.getmessage());
			}
	      System.out.println("completed");
		}

	}

