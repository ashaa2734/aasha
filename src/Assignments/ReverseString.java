package Assignments;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello";
		String rstr=" ";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rstr = ch+rstr;
		}
		System.out.println("reverse string=" + rstr);
		}
				
}
	


