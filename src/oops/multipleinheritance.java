package oops;
interface Bank1
{
	void deposite();
	void withdraw();
}
interface Bank2
{

	void interestrate();
	void balancedetails();
}
class ICICI implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("interestrate");
	}

	@Override
	public void balancedetails() {
		System.out.println("balance details");
	}

	@Override
	public void deposite() {
		System.out.println("deposite ");	
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw ");
	}	
}
public class multipleinheritance {

	public static void main(String[] args) {
	  ICICI OB=new ICICI();
	  OB.balancedetails();
	  OB.deposite();
	  OB.interestrate();
	  OB.withdraw();
	}
}
