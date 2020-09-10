package array;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	// Subject kor, eng, ...
	// 학생의 수강과목 리스트
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		// 수강 과목 리스트 생성
		subjectList = new ArrayList<Subject>();
	}
	// 수강신청
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
