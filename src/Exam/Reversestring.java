package Exam;

public class Reversestring {

	public static void main(String[] args) {
			String str="hai";
			String rstr=" ";
			char ch;
			for(int i=0;i<str.length();i++) {
				ch=str.charAt(i);
				rstr = ch+rstr;
			}
			System.out.println("reverse string=" + rstr);
			}
					
	}

	


