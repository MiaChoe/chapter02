//2021.11.26(금)10:47수업-14:30/Done_2021.12.16(수)06:28

package com.javaex.ex11;

public class Person {
	
	// 필드
	protected String name;
	protected int age;

	// 생성자
	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	// 메소드:getter,setter

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
	 * //만일 이정재나이에 음수를 넣었다면 이렇게getAge를 통해 음수 넣었을 시 1이 되게 중대한 실수는 막아줄 수 있음 public int
	 * getAge() { if(age<1) { return 1;} else { return age; } }
	 * 
	 */

	public void setAge(int age) {
		this.age = age;
	}

	// 메소드:일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.println("====================");
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.age);
		System.out.println("====================");
		System.out.println("");
	}

}

/* 2021.12.15(수)08:13_어느 생성자를 썼는지를 알기 위해서 Sysout.println(Person(3))이거 쓴 거고 질문했었음
 * 필드값을 직접읽는this.name과 메소드값을 읽는 getName
 * name, this.name, getName(), this.getName()모두 됨
*/