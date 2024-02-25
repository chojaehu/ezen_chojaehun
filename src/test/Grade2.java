package test;

import java.util.ArrayList;

public class Grade2 {
	String name;
	private double math = 0;
	private double English = 0;
	private double language = 0;
	private double sum = 0;
	private double average = 0;
	
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
	
	public double sum() {
		sum = math + English + language;
		
		return sum;
	}
	public double average() {
		average = (math + English + language)/3;
		return average;
	}
	


}
