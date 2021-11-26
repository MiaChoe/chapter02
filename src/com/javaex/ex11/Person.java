package com.javaex.ex11;//2021.11.26(금)10:47수업-14:30: 필드값을 직접읽는this.name과 메소드값을 읽는getName
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
public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {	
	}
	

	//메소드:getter,setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	/*
	//만일 이정재나이에 음수를 넣었다면 이렇게getAge를 통해 음수 넣었을 시 1이 되게 중대한 실수는 막아줄 수 있음
	public int getAge() {
		if(age<1) {
			return 1;}
		else {
		return age;
		}
	}
	
	*/
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//메소드:일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void showInfo()	{
		//name, this.name, getName(), this.getName()
		System.out.println("====================");
		System.out.println("이름: " + this.getName()); //this.name/getName/this.getName도 돼
		System.out.println("나이: " + this.age);
		
		System.out.println("====================");
		System.out.println("");
		
	}
	
	
}