//2021.11.30(화)11:11수업, 섞어쓰기하면 부모자식 다 메모리에 올리고 필요에 의해서 뭘 숨겼을 때를 실험할 예정
//이름이 겹치면 자식이 부모의 것을 쓴다 = override덮어씌워. 오버로딩은 생성자가 여러 개 중 골라서 쓰는 거고 모두 유효함
//메모리에 다 올리고 자식을 가려서 부모만 보게 함
//2021.11.30(화)14:50 오버라이딩

package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		
	}
}