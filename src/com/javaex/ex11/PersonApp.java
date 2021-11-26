package com.javaex.ex11;//2021.11.26(금)10:47수업
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
public class PersonApp {
	//필드
	
	//생성자
	
	//메소드:getter,setter
	
	//메소드 일반
	public static void main(String[] args) {
		Person p01 = new Person("정우성", 45);
		
		Person p02 = new Person();//이 행이 디폴트 생성자.public Person() {}을 써주지 않아서 오류가 났었음
		p02.setName("이정재");
		p02.setAge(46);
		
		//System.out.println(p01.toString());//PersonApp 51행 출력
		//System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		
		
	}

}
