package test2.second2;

public class ExPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student =new Student("지효", "111111-1111111", 0);
		
		System.out.println("student.getName()"+ student.getName());
		System.out.println("student.getSsn()" + student.getSsn());
		System.out.println("student.getStudentNO()" + student.getStudentNO());
		
		System.out.println("------------------------------------------------------");
		
		Student student2 =new Student("다현", "222222-2222222", 5);
		
		System.out.println("student.getName()"+ student2.getName());
		System.out.println("student.getSsn()" + student2.getSsn());
		System.out.println("student.getStudentNO()" + student2.getStudentNO());
		
		int i = 6%10;
		
		System.out.println(i);
		
		
	}

}
