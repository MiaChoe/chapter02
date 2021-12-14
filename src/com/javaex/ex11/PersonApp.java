package com.javaex.ex11;//2021.11.26(금)10:47-16:30수업/Done_2021.12.16(수)06:28

public class PersonApp {
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		p01.showInfo();

		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("아형고등학교");
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		System.out.println("===============");
		
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		System.out.println(s02.getName());
		
		s02.showInfo(); //생성자를 쓰지 않은 건가? Person(),Student()모두 출력 안 됐고 그럴 법함
		
		
		/*
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		Student s03 = new Student("강남고등학교");
		*/
		
		
		/*
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
	
		Person p02 = new Person();//이 행이 디폴트 생성자.public Person() {}을 써주지 않아서 오류가 났었음
		p02.setName("이정재");
		p02.setAge(46);
		*/
		
		
		//System.out.println(p01.toString());//PersonApp 51행 출력
		//System.out.println(p02.toString());
		
		
		/*
		System.out.println(p02.toString());
		System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		*/
		
		
		//System.out.println(p02.getAge());
		
		//Student Person상속받고 테스트
	}

}
