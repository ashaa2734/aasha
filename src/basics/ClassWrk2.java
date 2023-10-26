package basics;

public class ClassWrk2 {

	public static void main(String[] args) {
		/*String s="jmeter";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));

		String q="java language is platform independent";
		System.out.println(q.contains("language"));
		if(q.contains("language"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}*/
		
		String s3="selenium webdriver is used for webapplication testing";
		String a[]=s3.split("  ");
	//	for(String s1:a)
		//{
	//	System.out.println(s1);
			for(int i=0;i<a.length;i++)
			{
		
		System.out.println(a[i]);
		if(a[i].contains("webapplication"))
		{
			break;
		}
	}

		}
		
	}

	


