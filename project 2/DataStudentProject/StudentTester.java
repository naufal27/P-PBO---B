package pstudent;
public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(123,"Naufal","999-99-9999",3.4);
		System.out.println(s1);
		Student s2 = new Student(0,null,null,0);
		s2.setStudentId(124);
		s2.setName("Rahman");
		s2.setSSN("123-45-6789");
		s2.setGPA(4.0);
		System.out.println(s2);
		Student s3 = new Student(0,null,null,0);
		System.out.println(s3);
	}

}
