package chapter04_Exercise;

import java.util.Scanner;

public class Exercise {

	private static String ex;

	public static void main(String[] args) {

		ex = "1. ���ǹ��� �ݺ����� ������ ��������";
		System.out.println(ex);

		ex = "=> ���ǹ�: if�� , switch�� \n=> �ݺ���: for��, while��, do~while��";
		System.out.println(ex);
		System.out.println();

		ex = "2. ���ǹ��� �ݺ����� ������ �� �� Ʋ�� ���� �����Դϱ�? 2";
		System.out.println(ex);
		ex = " 1) if���� ���ǽ��� ����� ���� ���� �帧�� �޸��� �� �ִ�";
		System.out.println(ex);
		ex = " 2) switch������ ����� �� �ִ� ������ Ÿ���� int, double�� �� �� �ִ�";
		System.out.println(ex);
		ex = " 3) for���� ī���� ������ ������ Ƚ����ŭ �ݺ���ų �� ����� �� �ִ�";
		System.out.println(ex);
		ex = " 4) breake���� switch��, for��, while���� ������ �� ����� �� �ִ�";
		System.out.println(ex);
		System.out.println();

		ex = "3. for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϱ�";
		System.out.println(ex);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("=> 1 ~ 100���� ���� �� 3�� ����� �� ��: " + sum);
		System.out.println();

		ex = "4. while���� Math.random() �޼ҵ带 �̿��ؼ� �ΰ��� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,\n"
				+ " ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����.";
		System.out.println(ex);
		System.out.print("=> ");
		int  dise1 = 0, dise2 = 0;
		while ((dise1 + dise2) != 5) {
			dise1 = (int) (Math.random() * 6 + 1);
			dise2 = (int) (Math.random() * 6 + 1);
			System.out.printf("(%d,%d)",dise1,dise2);
		}
		System.out.println("\n");
		
		ex="5. ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����غ�����."
			+"\n��, x�� y�� 10 ������ �ڿ��� �Դϴ�.";
		System.out.println(ex);
		System.out.printf("=> ");
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d, %d) ",x,y);
				}
			}
		}
		System.out.println();
		
		ex="6. for���� �̿��ؼ� �����ϴ� ���� ����ϴ� �ڵ� �ۼ�";
		System.out.println(ex);
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		ex="7. while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� �����"
		+" �����ϴ� �ڵ带 �ۼ��� ������.";
		System.out.println(ex);
		boolean run = true;
		int balance=0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� : 2.��� : 3.�ܰ� : 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("���ݾ�>");
				balance += sc.nextInt();
			}else if(choice == 2) {
				System.out.print("��ݾ�>");
				balance -= sc.nextInt();
			}else if(choice == 3) {
				System.out.print("�ܰ�>"+balance+"\n");
				
			}else if(choice == 4) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
		
		
		
		
		
		
	}

}
