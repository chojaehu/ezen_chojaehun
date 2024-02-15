package test;

public class Gugudan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1 ; i < 10 ; i++)
		{
			int sum = 0;
			for(int j = 1 ; j < 10 ; j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
				sum += i*j;
			}
			System.out.println(i +"단의 합은" + sum);
			System.out.println("--------------------------------");
		}
	}

}
