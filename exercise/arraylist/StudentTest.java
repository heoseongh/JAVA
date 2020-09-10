package array;

public class StudentTest {

	public static void main(String[] args) {
		Student heo = new Student(1001, "Heo");
		
		heo.addSubject("국어", 100);
		heo.addSubject("수학", 90);
		
		Student kim = new Student(1002, "Kim");
		
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 90);
		kim.addSubject("영어", 80);
		
		heo.showStudentInfo();
		System.out.println("==================================");
		kim.showStudentInfo();
		
	}

}
