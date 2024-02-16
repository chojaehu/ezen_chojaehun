package test;

public class Grade {
	
	public static void main(String[] args) {
		String[] name = {
				"Tong",
				"Tiffany",
				"Jennifer"
				};
		String[] subject = {"name",
				"language",
				"English",
				"mathe", 
				"sum",
				"Average"
				};
		int[][] Score = {
				{55,65,72},
				{95,98,100},
				{21,15,30}
				};
		int[] rank = new  int[name.length];		
//		for(int m = 0 ; m < subject.length; m ++)
//		{
//			System.out.print(String.format("%-10s", subject[m]));
//		}
//		System.out.println();
		
		for(int i = 0; i < name.length; i++ )
		{
			System.out.print(String.format("%-10s",name[i] ));

			int sum = 0;
			double result = 0;
			for(int j = 0 ; j < name.length ; j++)
			{
				System.out.print(String.format("%-10s",Score[i][j]));
				sum += Score[i][j]; 				
				
			}
			result = (double)sum/Score.length;
			System.out.print(String.format("%-9s",sum));
			System.out.println(String.format("%.1f",result));
		}
	}

}
