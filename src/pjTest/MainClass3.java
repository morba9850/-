package pjTest;

import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int[] num = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("num1 ���� �Է� : ");
		num[0] = scanner.nextInt();
		System.out.printf("num2 �����Է�: ");
		num[1] = scanner.nextInt();
		
		
		if(num[0] < num[1]) {
			System.out.println("num1�� num2���� �۴�");
		} else if(num[0] > num[1]) {
			System.out.println("num1�� num2���� ũ��");
		} else {
			System.out.println("num1�� num2�� ����");
		}
		
		
		
		}
	}

