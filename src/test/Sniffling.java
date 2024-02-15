package test;

import java.util.Scanner;

public class Sniffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		
//		if(i%2==0){
//			System.out.println("짝수입니다.");			
//		}
//		else {
//			System.out.println("홀수입니다.");
//		}
		
		
		
	/*	int num = 3;
		
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
		*/
		String[] name = {"조재훈","조재원","조재은"};
		int[][] point= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
				};		
		
		for(int i = 0 ; i < point.length ; i++)
		{
			int sum = 0;
			
			for(int j =0 ; j < point.length ; j++) {
				
			}
			System.out.print("평균"+sum/3);
			System.out.println();
		}
		
		
	}

}
