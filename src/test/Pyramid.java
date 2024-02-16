package test;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		for(int i = 0 ;i < num ; i++)
		{		
			for(int j = 0 ; j < num - i ; j++)
			{
				System.out.print(" ");
			}
			for(int c = 0 ; c<i+(i+1); c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		for(int i = num ; i >=0 ; i--)
//		{
//			for(int j = 0 ; j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
		
		
		
//		for(int i = 0 ; i<=num ; i++)
//		{
//			for(int j = 0 ;  j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

		
		
		
	}

}
