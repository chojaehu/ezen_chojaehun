package test2.second;


public class HandBag extends Bag {
	private int prise;

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	
	void synthesis() {
		System.out.println(" 브랜드 : "+getBrand() + " | " +" 이름 : "+getModel() + " | " +" 가격 : "+prise);
	}
	
	
}
