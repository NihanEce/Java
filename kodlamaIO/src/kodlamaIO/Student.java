package kodlamaIO;

public class Student extends User {
	private int studentNumber;
	private String schoolName;
	private String department;
	private int examScore;
	private String takenCourse;
	
	
	public Student() {
		
	}
	
	public Student(int studentNumber,String schoolName, String department, int examScore,String takenCourse) {
		this.studentNumber=studentNumber;
		this.schoolName=schoolName;
		this.department=department;
		this.examScore=examScore;
		this.takenCourse=takenCourse;
		
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	};
	

}
