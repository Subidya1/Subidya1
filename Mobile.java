package week1.day1;

public class Mobile {
	 public void makecall() {
	 System.out.println("Call connected");
	 }
	 public void sendmsg() {
		 System.out.println("Message sent");
	 }
	 
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makecall();
		mob.sendmsg();
	
		
	}

} 