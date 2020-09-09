import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	static ArrayList<Student> list = new ArrayList<Student>();
	Student student;
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String hakbun;
	private String major;

	//초기화 생성자 -> 기본 데이터 구축
	public Student() {
		//Student student;	
		student = new Student("Lee", "20161234", "간호학과");
		list.add(student);
		student = new Student("Koo", "20151234", "컴퓨터공학");
		list.add(student);
		student = new Student("Park", "20154444", "화학공학과");
		list.add(student);
		student = new Student("Kim", "20157777", "유아교육과");
		list.add(student);
	}
	
	public Student(String name, String number, String major) {	//저장할 데이터 변수
		this.name = name;
		this.hakbun = number;
		this.major = major;
	}
	
	//INSERT_function
	public void INSERT() {
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("Hakbun : ");
		hakbun = sc.next();
		System.out.print("Major : ");
		major = sc.next();
		
		student = new Student(name, hakbun, major);	//데이터 객체로 만들기
		list.add(student);			// 리스트에 새로 추가
		System.out.println(">> add successfully!\n");
	}
	
	//Search_function
	public void SEARCH() {
		System.out.print("Hakbun >> ");		//검색할 학번 입력
		hakbun = sc.next();
		
		for (Student s : list) {			//배열 list를  변수s에 담아 차례대로 비교.
			if (s.hakbun.equals(hakbun)) {
				System.out.println("[Searched]");
				System.out.println("Name : " + s.name);
				System.out.println("Hakbun : " + s.hakbun);
				System.out.println("Major : " + s.major);
				System.out.println();
			}
		}
	}
	
	//Delete_function
	public void DELETE() {
		System.out.print("Hakbun >> ");		//삭제할 학번 입력
		hakbun = sc.next();
		for (Student s : list) {
			if (s.hakbun.equals(hakbun)) {
				list.remove(s);
				System.out.println(">> delete successfully!\n");
			}
		}
	}

	public static void main(String str[]) {
		//ArrayList<Student> list = new ArrayList<Student>();
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		int fn;
		
		while (true) {
			System.out.println("add(1) search(2) delete(3) exit(4)");	//사용자가 할 작업 선택
			System.out.print(">> ");
			
			fn = sc.nextInt();
			
			switch (fn) {
				case 1: st.INSERT(); break;		//add
				case 2: st.SEARCH(); break;		//search
				case 3: st.DELETE(); break;		//delete
				case 4: return;								//exit
			}
		}
	}
}