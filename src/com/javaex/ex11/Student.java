package com.javaex.ex11;//2021.11.26(금)12:03수업, 04.상속과 다형성
						//person을 '날로 먹기 위해' extends+부모이름
/*
[문제]
Person 클래스를 만드세요.
	생성자, getter/setter, showInfo()

Person 클래스를 상속받아 Student 클래스를 만드세요.
	생성자, getter/setter, showInfo()

PersonApp 클래스를 통해서 인스턴스를 생성하고 showInfo()를 통해 확인하세요.
	Person p = new Person("정우성", 45);
	Student s1 = new Student("서울고등학교");
	Student s2 = new Student("이정재", 45, "한국고등학교" );

자식 클래스와 부모클래스의 생성자 순서를 확인하세요
*/

public class Student extends Person{
	//필드: person클래스에 name과 age가 이미 있으므로 '날로 먹기 위해' extends+부모이름
	private String schoolName;
	
	
	//생성자
	public Student() {
	}
	
	public Student(String schoolName){
		this.schoolName = schoolName;
	}
	
	
	//메소드:getter,setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메서드:일반(Method와 Inheritance제외)
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	
	
}
