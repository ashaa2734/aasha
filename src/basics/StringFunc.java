package basics;

public class StringFunc {

	public static void main(String[] args) {
		/*//length of a string
		String s="welcome";
		System.out.println(s.length());
		int w=s.length();
		System.out.println("length:"+w);
		
		//join 2 string
		String s1="hello";
		String s2="luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
		String s5="luminar";
		System.out.println(s5.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		System.out.println(s5.endsWith("e"));
		
		System.out.println(s5.startsWith("l"));*/
		
		
		//trim
		/*String q=" helo";
		System.out.println(q);
		System.out.println(q.trim());*/
		
		//extract portion
		/*String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,4));
		
		//words/char present or not:contains
		String x="welcome to Luminar";
		System.out.println(x.contains("luminar"));
		
		//replace()
		System.out.println(y.replace("el","xy"));
		
		//to display particular character
		String z="welcome";
		System.out.println(z.charAt(4));//
		
		//split
		/* String w1="welcome to luminar";
		String[]words=w1.split("  ");
		for(String i:words)
		{
			System.out.print(i);
		}*/
		
		//toCharArray
        String t="hello";
        char[] c1=t.toCharArray();
        for(char v:c1)
        {
	    System.out.println(v);
         }
		
				
			

	}

}
