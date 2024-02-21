package test2;

public class ExPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		
		phone.phoneOn();
		phone.phoneOff();
		
		phone.setPhoneType("미노트 11");
		phone.setColor("브라운");
		System.out.println("----------------------------------------------------");
		
		phone.phoneOn();
		phone.phoneOff();
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("phone.getPhoneType() : "+phone.getPhoneType());
		System.out.println("phone.getColor() : " + phone.getColor());
		
		cellPhone.settelecom("LG");
		cellPhone.setPhoneType("낫싱폰");
		cellPhone.setColor("투명");
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("cellPhone.gettelecom() : " +cellPhone.gettelecom());
		System.out.println("cellPhone.getPhoneType() : "+cellPhone.getPhoneType());
		System.out.println("cellPhone.getColor() : "+cellPhone.getColor());
		
		System.out.println("----------------------------------------------------");
		
		cellPhone.phoneOn();
		cellPhone.phoneOff();
		
		
		
	}

}
