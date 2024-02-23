package ch07;

public class Radio implements RemoteControl {

	@Override
	public void turnon() {
		System.out.println("Radio turnon");

	}

	@Override
	public void turnooff() {
		System.out.println("Radio turnoff");

	}

}
