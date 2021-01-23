package chapter04_Exercise;

import java.util.Scanner;

public class Exercise {

	private static String ex;

	public static void main(String[] args) {

		ex = "1. 조건문과 반복문의 종류를 적으세요";
		System.out.println(ex);

		ex = "=> 조건문: if문 , switch문 \n=> 반복문: for문, while문, do~while문";
		System.out.println(ex);
		System.out.println();

		ex = "2. 조건문과 반복문을 설명한 것 중 틀린 것은 무엇입니까? 2";
		System.out.println(ex);
		ex = " 1) if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다";
		System.out.println(ex);
		ex = " 2) switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다";
		System.out.println(ex);
		ex = " 3) for문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용할 수 있다";
		System.out.println(ex);
		ex = " 4) breake문은 switch문, for문, while문을 종료할 때 사용할 수 있다";
		System.out.println(ex);
		System.out.println();

		ex = "3. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하기";
		System.out.println(ex);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("=> 1 ~ 100까지 정수 중 3의 배수의 총 합: " + sum);
		System.out.println();

		ex = "4. while문과 Math.random() 메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 현태로 출력하고,\n"
				+ " 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.";
		System.out.println(ex);
		System.out.print("=> ");
		int  dise1 = 0, dise2 = 0;
		while ((dise1 + dise2) != 5) {
			dise1 = (int) (Math.random() * 6 + 1);
			dise2 = (int) (Math.random() * 6 + 1);
			System.out.printf("(%d,%d)",dise1,dise2);
		}
		System.out.println("\n");
		
		ex="5. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해보세요."
			+"\n단, x와 y는 10 이하의 자연수 입니다.";
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
		
		ex="6. for문을 이용해서 증가하는 별을 출력하는 코드 작성";
		System.out.println(ex);
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		ex="7. while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을"
		+" 제공하는 코드를 작성해 보세요.";
		System.out.println(ex);
		boolean run = true;
		int balance=0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("예금액>");
				balance += sc.nextInt();
			}else if(choice == 2) {
				System.out.print("출금액>");
				balance -= sc.nextInt();
			}else if(choice == 3) {
				System.out.print("잔고>"+balance+"\n");
				
			}else if(choice == 4) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
