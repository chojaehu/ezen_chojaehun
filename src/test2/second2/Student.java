package test2.second2;

public class Student extends People {
	private int studentNO;

	public int getStudentNO() {
		return studentNO;
	}

	public void setStudentNO(int studentNO) {
		this.studentNO = studentNO;
	}
	
	Student(String name, String ssn, int studentNO){
		super(name, ssn);
		this.studentNO = studentNO;	
	}
	Student(){
	
	}

}
