package pjTest;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
	String[] name = {"����ȣ" , "�̽¿�", "�ں�ȣ", "�̺���", "������"};
	int[] score = new int[5];
	
	Scanner scanner = new Scanner(System.in);
	System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[0]);
	score[0] = scanner.nextInt();
	
	System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[1]);
	score[1] = scanner.nextInt();
	
	System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[2]);
	score[2] = scanner.nextInt();
	
	System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[3]);
	score[3] = scanner.nextInt();
	System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[4]);
	score[4] = scanner.nextInt();
	
	System.out.printf("%s ���� : %s \n", name[0], score[0]);
	System.out.printf("%s ���� : %s \n", name[1], score[1]);
	System.out.printf("%s ���� : %s \n", name[2], score[2]);
	System.out.printf("%s ���� : %s \n", name[3], score[3]);
	System.out.printf("%s ���� : %s \n", name[4], score[4]);
	
	double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
	System.out.printf("--------------------\n����  : %s", ave);
	scanner.close();
	
	
	}

}
