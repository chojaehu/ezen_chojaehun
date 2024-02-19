package test;

import java.util.ArrayList;

public class Grade2 {
	String name;
	double math = 0;
	double English = 0;
	double language = 0;
	
	public Grade2(String name,double math,double English,double language) {
		this.name = name;
		this.math = math;
		this.English =English;
		this.language = language;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	
	public void setLanguag(double language) {
		this.language = language;
	}
	public double getLanguage() {
		return language;
	}
	
	public void setLanguage(double language) {
		this.language = language;
	}
	
	public void score() {
		ArrayList<Double> arr = new ArrayList<>();
		arr.add(math);
		arr.add(English);
		arr.add(English);
		
		for(int i = 0 ; i < arr.size() ; i++)
		{
			System.out.print(String.format("%-10s",arr.get(i)));
		}
	}
	public void scoresum() {
		double sum = 0;
		sum = math + English + language;
		System.out.print("합계 : "+String.format("%-10s", sum));
		sum = sum/3;
		System.out.print("평균 : "+String.format("%-10s", sum));
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade2 g1 = new Grade2("Tong", 85, 35, 78);
		
		g1.score();
		g1.scoresum();

	}

}
