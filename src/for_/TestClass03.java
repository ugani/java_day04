package for_;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repet;
		System.out.print("반복 횟수 입력 :");
		repet = input.nextInt();
		for(int i=0; i<repet; i++) {
			System.out.println(i+".번 반복");
		}
		System.out.println("다음 문장들 실행");
		System.out.println("==============");
		for(int i = 10; repet < i; i--) {
			System.out.println(i+".번 실행");
		}
	}

}
