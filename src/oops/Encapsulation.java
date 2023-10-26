package oops;

class Encap
{
	private String name;
	private String designation;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Encap ob=new Encap();
		//0b.setdesignation("testers");
		//System.out.println(ob.getdesignation());
		ob.setName("asha");
		System.out.println(ob.getName());

	}

}
