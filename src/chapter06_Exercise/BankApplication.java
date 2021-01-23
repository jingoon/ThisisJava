package chapter06_Exercise;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 : 2.계좌목록 : 3.예금 : 4.출금 : 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			

			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine(); 
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		Account ac1 = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = ac1;
				System.out.println("결과 "+ (i+1) +"번째의 계좌가 생성되었습니다 ");
				break;
			}
		}

	}

	// 계좌 목록
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String id = accountArray[i].getAno();
				String name = accountArray[i].getOwner();
				int money = accountArray[i].getBalance();
				System.out.println(id+" : "+name+" : "+money);
			}
		}
			
	}

	// 예금
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호 ");
		String ano = scanner.nextLine();
		System.out.print("예금액 ");
		int b = scanner.nextInt();
		scanner.nextLine();
		Account ac= findAccount(ano);
		if(ac == null) {
			System.out.println("예금이 취소되었습니다.");
			return;
		}
		
		ac.setBalance(ac.getBalance()+b);
		System.out.println("예금 성공! 계좌 잔액: "+ ac.getBalance());
	}

	// 출금
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호 ");
		String ano = scanner.nextLine();
		System.out.print("출금액 ");
		int b = scanner.nextInt();
		scanner.nextLine();
		Account ac= findAccount(ano);
		if(ac == null) {
			System.out.println("출금이 취소되었습니다.");
			return;
		}
		
		ac.setBalance(ac.getBalance()-b);
		System.out.println("출금 성공! 계좌 잔액: "+ ac.getBalance());
	}

	// 계좌 찾기
	private static Account findAccount(String ano) {
		Account ac = null;
		for (int i = 0; i < accountArray.length; i++) {
			if( accountArray[i].getAno().equals(ano)) {
				ac = accountArray[i];
				return ac;
			}
		}
		System.out.println("일치하는 계좌를 찾지 못함");
		return ac;
	}

}
