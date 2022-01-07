package week1.day1;

public class Mobile {
	private void makeCall() {
		System.out.println("MAKECALL");
	}
	private void sendmsg() {
		System.out.println("Sendmsg");
	}

	public static void main(String[] args) {
		Mobile phone = new Mobile();
		
		phone.makeCall();
		phone.sendmsg();
		

	}

}
