package week3.day1;

public class SmartPhone extends AndroidPhone{

	public void ConnectWhatsApp() {
		System.out.println("ConnectWhatsApp");
	}
	public void TakeVideo() {
		System.out.println("TakeVideo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone sm = new SmartPhone();
		sm.TakeVideo();
	}
}
