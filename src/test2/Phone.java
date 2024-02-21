package test2;

public class Phone {
	
	private String color;
	private String phoneType;
	
	void phoneOn() {
		System.out.println(phoneType + "을 킵니다.");
	}
	
	void phoneOff() {
		System.out.println(phoneType + "에 작동을 중단합니다..");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	

}
