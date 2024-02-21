package test2;

public class CellPhone extends Phone {

	private String telecom;
	
	void telecomOn() {
		System.out.println("작동을 시작합니다..");
	}
	@Override
	void phoneOn() {
		System.out.println(telecom + "연결이 되었습니다.");
	}
	@Override
	void phoneOff() {
		System.out.println(telecom + "연결이 끊겼습니다..");
	}
	void telecomOff() {
		System.out.println("작동을 중단합니다..");
	}

	public String gettelecom() {
		return telecom;
	}

	public void settelecom(String cell) {
		this.telecom = cell;
	}

	

}
