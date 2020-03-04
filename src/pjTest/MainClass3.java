package pjTest;

import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int[] num = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("num1 점수 입력 : ");
		num[0] = scanner.nextInt();
		System.out.printf("num2 점수입력: ");
		num[1] = scanner.nextInt();
		
		
		if(num[0] < num[1]) {
			System.out.println("num1는 num2보다 작다");
		} else if(num[0] > num[1]) {
			System.out.println("num1는 num2보다 크다");
		} else {
			System.out.println("num1과 num2는 같다");
		}
		
		
		
		}
	}

