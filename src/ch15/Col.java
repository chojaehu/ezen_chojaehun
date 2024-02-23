package ch15;

import java.util.ArrayList;
import java.util.List;

public class Col {

	public static void main(String[] args) {


//		List<String> list = new ArrayList<String>();
//		
//		list.add("aa");
//		list.add("aaa");
//		
//		for(int i = 0 ; i < list.size() ; i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		for(String a : list)
//		{
//			System.out.println(a);
//		}
//		
		
		List<Language> list2 =new ArrayList<>();
		
		Language language = new Language("k", 1);
		
		Language language2 = new Language("c", 2);
		
		list2.add(language);
		list2.add(language2);
		
		for(Language language3 : list2)
		{
			System.out.println(language3.getName() +"|"+ language3.getVersion());
		}

	}

}
