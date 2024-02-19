package second;

public class ExHandbag {

	public static void main(String[] args) {
		
		
		Handbag handbag = new Handbag();
		
		handbag.brand = "샤넬";
		handbag.Type = 1;
		handbag.prise = 100;
		
		System.out.println("handbag.prise : "+handbag.brand);
		System.out.println("handbag.Type : "+handbag.Type);
		System.out.println("handbag.Type : "+handbag.prise);
		
		System.out.println("------------------------------------------------------");
		
		Handbag handbag2 = new Handbag();
		
		handbag2.brand = "루이비통";
		handbag2.Type = 1;
		handbag2.prise = 200;
		
		System.out.println("handbag2.prise : "+handbag2.brand);
		System.out.println("handbag2.Type : "+handbag2.Type);
		System.out.println("handbag2.prise : "+handbag2.prise);
		}

}
