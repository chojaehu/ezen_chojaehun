package ch06;

import second.Handbag;

public class ExCar {

	public static void main(String[] args) {
		
		Car car = new Car("벤츠","S클래스",1,300.12);
		
		System.out.println("car.brnad : "+car.brnad);
		System.out.println("car.name : "+ car.name);
		System.out.println("car.carType : "+ car.carType);
		System.out.println("car.carType : "+car.power);
		
		car.go();
		car.back();
		car.left();
		car.right();
		
		System.out.println("------------------------------------------------------");
		
		Car car5 = new Car("BMW", "720i", 1, 400.56);
		
		System.out.println("car5.brnad : "+car5.brnad);
		System.out.println("car5.name : "+ car5.name);
		System.out.println("car5.carType : "+ car5.carType);
		System.out.println("car5.carType : "+car5.power);
		
		System.out.println("------------------------------------------------------");
		
		
		Car car2 = new Car();
		
		car2.brnad = "HY";
		car2.name = "소나타";
		car2.carType = 3;
		car2.power = 150.12;
		
		System.out.println("car2.brnad : "+car2.brnad);
		System.out.println("car2.name : "+ car2.name);
		System.out.println("car2.carType : "+ car2.carType);
		System.out.println("car2.carType : "+car2.power);		
		
		System.out.println("------------------------------------------------------");
		
		Car car3 = new Car();
		
		car3.brnad = "KIA";
		car3.name = "K9";
		car3.carType = 1;
		car3.power = 300.14;
				
		
		System.out.println("car3.brnad : "+car3.brnad);
		System.out.println("car3.name : "+ car3.name);
		System.out.println("car3.carType : "+ car3.carType);
		System.out.println("car3.carType : "+car3.power);	
		
		System.out.println("------------------------------------------------------");
		
		SportsCar sportsCar = new SportsCar();
		
		sportsCar.brand = "아우디";
		sportsCar.name = "a6 GT";
		sportsCar.carType = 0;
		sportsCar.power = 600.12;
		
		System.out.println("sportsCar.brand : "+sportsCar.brand);
		System.out.println("sportsCar.name : "+sportsCar.name);
		System.out.println("sportsCar.carType : "+sportsCar.carType);
		System.out.println("sportsCar.power : "+sportsCar.power);
		
		Handbag handbag = new Handbag();
		
		handbag.brand = "구찌";
		

	}

}
;