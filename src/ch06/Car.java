package ch06;

public class Car {
	
	String brnad;
	String name;
	int carType;
	double power;
	
	private int aaa;
	
	public int getAaa() {
		return aaa;
	}

	public void setAaa(int aaa) {
		this.aaa = aaa;
	}

	Car(String brnad,String name,int carType,double power){
		this.brnad =brnad;
		this.name = name;
		this.carType = carType;
		this.power = power;
	}
	Car(){
		
	}
	void go() {
		System.out.println("앞으로 갑니다");
	}
	void back() {
		System.out.println("뒤으로 갑니다");
	}
	void left() {
		System.out.println("왼쪽으로 갑니다");
	}
	void right() {
		System.out.println("오른쪽으로 갑니다");
	}
	
	

}
