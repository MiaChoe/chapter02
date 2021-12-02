//2021.11.2(목)11:40수업: 예외처리

package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {
	public static void main(String[] args) {
		
		double result; //얘는 main()안에 있는, 즉 한 번 실행되고 나면 사라지는 애다. 필드가 아니므로 private같은 접근제한자를 적지 않음
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
				
		try {//try는 발생할지 안 할지 감시하는 구간
			result = 100/num;
			System.out.println(result);
		}catch(ArithmeticException error) {//ArithmeticException 상황이 발생하면 catch영역으로
			System.out.println(error.toString());
		}finally { //상황이 발생하지 않으면 finally영역으로. 예외상황 발생 여부와 무관하게 항상 처리됨
			System.out.println("Finally영역");
		}
		
		
		result = 100/num;
		System.out.println(result);
		
		sc.close();
	}
	
	
}
