package example.conditional;

import java.util.Scanner;

public class Conditional {
	public void testIf() {
		int kor = 87;
		int math = 55;
		int eng = 68;
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		//if
		if(avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//if - else if - else
		if(avg >= 60) {
			System.out.println("합격");
		} else if(avg >= 40) {
			System.out.println("보충 수업");
		} else {
			System.out.println("불합격");
		}
		
		//중첩 if문
		String grade = "";
		if(kor >= 80) {
			grade = "A";
			if(kor >= 95) {
				grade += "+";
			} else if(kor >= 85) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if(kor >= 60) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println("국어 성적은 " + grade + "입니다.");
	}
	
	public void testSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름 입력: ");
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
			break;
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}
}
