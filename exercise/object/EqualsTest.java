package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	@Override
	// '이름과 학번이 같으면 같은 학생이다'라고 재정의
	public boolean equals(Object obj) {
		// Student 객체가 Object로 넘어오기 때문에 업캐스팅이 되므로
		// 다시 다운캐스팅을 해줘야 한다.
		if(obj instanceof Student) {
			Student std = (Student)obj;
			// return (this.studentNum == std.studentNum);
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.studentNum;
	}
}

public class EqualsTest {
	
	public static void main(String[] args) {
	
		Student Lee = new Student(100, "이순신");
		Student Shin = new Student(100, "이순신");
		
		System.out.println("Lee equals Shin ? " + Lee.equals(Shin));
		
		System.out.println("Lee hashCode : " + Lee.hashCode());
		System.out.println("Shin hashCode : " + Shin.hashCode());
		
		System.out.println("Lee Real_hashCode : " + System.identityHashCode(Lee));
		System.out.println("Shin Real_hashCode : " + System.identityHashCode(Shin));
			
	/*	String s1 = "aaa";
		String s2 = "aaa";
		
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println("i1 == i2 : " + i1.equals(i2));
		System.out.println("i1_hashCode : " + i1.hashCode());
		System.out.println("i2_hashCode : " + i2.hashCode());
		System.out.println();
		System.out.println("s1 == s2 : " + s1.equals(s2));
		System.out.println("s1_hashCode : " + s1.hashCode());
		System.out.println("s2_hashCode : " + s2.hashCode());
	*/
	}
}
