package ch07;

public class Television implements RemoteControl {

	@Override
	public void turnon() {
		System.out.println("켜진다");
	}

	@Override
	public void turnooff() {
		System.out.println("꺼진다");
	}

}
