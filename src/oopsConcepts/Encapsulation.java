package oopsConcepts;

class Student{
	private String student_name;

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudent_name("tony bhaskar");
		System.out.println(student.getStudent_name());
	}

}
