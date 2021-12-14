//2021.11.26(금)12:03수업, 04.상속과 다형성/Done_2021.12.16(수)06:28

package com.javaex.ex11;

public class Student extends Person {

	// 필드: Person클래스에 name과 age가 이미 있으므로 '날로 먹기 위해' extends+부모이름
	private String schoolName;

	// 생성자
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {// 부모 생성자 실행 <=있어야 함
		super();
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	// 메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 일반(여기선 inheritance 제외)
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

	public void showInfo2() {

		System.out.println("*************");
		System.out.println("이름: " + super.name);
		System.out.println("나이" + super.age);
		System.out.println("학교" + this.schoolName);
		System.out.println("*************");
		System.out.println("");
	}

}

/*
 * person을 '날로 먹기 위해' extends+부모이름
 */
