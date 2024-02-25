package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exgrade {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		List<Grade2> list = new ArrayList<>();
		
		Grade2 grade1 = new Grade2("토니", 80,72, 87);
		Grade2 grade2 = new Grade2("진", 77,43, 92);
		Grade2 grade3 = new Grade2("토니", 90,88, 99);
		
		list.add(grade1);
		list.add(grade2);
		list.add(grade3);
		
//		list = list.stream().sorted
//				(Comparator.comparing(Grade2 :: average).reversed()).collect(Collectors.toList());
		
		list.sort(Comparator.comparing(Grade2 :: average).reversed());
		for(Grade2 grade22 : list)
		{
			
			System.out.println(String.format("%-5s", i) 
					+ String.format("%-5s", grade22.getName()) 
					+ String.format("%-5s",grade22.getMath()) + " | " 
					+ String.format("%-5s",grade22.getEnglish()) +" | "
					+ String.format("%-5s",grade22.getLanguage()) + " | " 
					+ String.format("%-5s",grade22.sum()) +" | "
					+ String.format("%.2f",grade22.average()));
			i++;
			
		}
		
	}

}
