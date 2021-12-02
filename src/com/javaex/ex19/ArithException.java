//2021.11.2(목)11:08수업: 예외처리

package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {
		
		double result; //얘는 main()안에 있는, 즉 한 번 실행되고 나면 사라지는 애다. 필드가 아니므로 private같은 접근제한자를 적지 않음
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		result = 100/num;
		System.out.println(result);
		
		sc.close();
	}
	
	
}
