package example.review;

import java.util.Scanner;

public class Review {
	public void method1() {
		//char <-> int
		int num = 'A';
		System.out.println("num : " + num); //65
		
		char ch = 66;
		//char ch2 = -66;
		System.out.println("ch : " + ch); //B
		
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2); //A
		
		//int와 long 연산
		
		int inum = 4;
		long lnum = 8L;
		
		int sum = inum + (int)lnum;
		sum = (int)(inum + lnum);
		long sum2 = inum + lnum;
		
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		
		//byte, short의 연산 결과 : int
		byte bnum = 1;
		short snum = 2;
		
		short sum3 = (short)(bnum + snum);
		int sum4 = bnum + snum;
		
		System.out.println("sum3 : " + sum3);
		System.out.println("sum4 : " + sum4);
	}
	public void method2() {
		//삼항 연산자
		//사용자에게 값을 하나 받아서 그 값이 양수인지 음수인지 0인지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
		System.out.println(result);
	}
	public void method3() {
		//switch
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "귤" :
			price = 500;
			break;
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		default :
			System.out.println("해당하는 과일이 없습니다.");
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}
}
