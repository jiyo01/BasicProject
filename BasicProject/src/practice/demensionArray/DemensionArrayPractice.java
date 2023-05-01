package practice.demensionArray;

import java.util.Scanner;

public class DemensionArrayPractice {
	public void method1() {
		//가변배열 초기화 및 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 입력 : ");
		char[][] arr = new char[sc.nextInt()][];
		
		//열 할당
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열의 크기 입력 : ");
			arr[i] = new char[sc.nextInt()];
		}
		
		//초기와와 출력
		char ch = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
