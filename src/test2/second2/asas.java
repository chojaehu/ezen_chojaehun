package test2.second2;




import java.util.ArrayList;
import java.util.Collections;


public class asas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9;	
		
		ArrayList<Character> c = new ArrayList<>();
		ArrayList<Integer> bb =new ArrayList<>();
		String string= "";
		
//		int[] dd = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
		while(a > 0)
		{
			bb.add(a %10);
			a /= 10;
		}	
		Collections.reverse(bb);
		for(int i = 97 ; i <=122 ; i++)
		{
			c.add((char) i);
			
		}
		for(int k = 0 ; k <= bb.size() - 1 ; k++)
		{
			char answer = c.get(bb.get(k));
			string += answer;
		}
		System.out.println(c);
		System.out.println(string);

	}




}
