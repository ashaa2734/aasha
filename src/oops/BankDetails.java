package oops;

class Bank
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposite");
	}
}
class Sbi extends Bank
{
	public void Sbiinterest()
	{
		System.out.println("Sbiinterest");
	}
}
class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("hdfc loan");
	}
}

public class BankDetails {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.deposit();
		ob.Sbiinterest();
		ob.withdraw();
		Hdfc obj=new Hdfc();
		obj.deposit();
		obj.withdraw();
		obj.loan();

	}

}
