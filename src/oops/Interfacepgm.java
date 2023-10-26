package oops;

interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
}

class audiocalls implements whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("calls");		
	}

	@Override
	public void mute() {
		System.out.println("mute");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}
	
}
class Videocalls implements whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("calls");
		
	}

	@Override
	public void mute() {
		System.out.println("mute");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		
   audiocalls a=new audiocalls();
   a.calls();
   a.mute();
   a.disconnect();
   Videocalls v=new Videocalls();
   v.calls();
   v.mute();
   v.disconnect();
   whatsappcalls ob=new audiocalls();
   ob.calls();
   ob.mute();
   ob.disconnect();
  ob=new Videocalls();
  ob.calls();
  ob.mute();
  ob.disconnect();
	}

}
