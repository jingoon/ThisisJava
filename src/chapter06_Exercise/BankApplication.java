package chapter06_Exercise;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� : 2.���¸�� : 3.���� : 4.��� : 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			

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
		System.out.println("���α׷� ����");
	}

	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine(); 
		
		System.out.print("������: ");
		String owner = scanner.nextLine();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();

		Account ac1 = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = ac1;
				System.out.println("��� "+ (i+1) +"��°�� ���°� �����Ǿ����ϴ� ");
				break;
			}
		}

	}

	// ���� ���
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

	// ����
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		System.out.print("���¹�ȣ ");
		String ano = scanner.nextLine();
		System.out.print("���ݾ� ");
		int b = scanner.nextInt();
		scanner.nextLine();
		Account ac= findAccount(ano);
		if(ac == null) {
			System.out.println("������ ��ҵǾ����ϴ�.");
			return;
		}
		
		ac.setBalance(ac.getBalance()+b);
		System.out.println("���� ����! ���� �ܾ�: "+ ac.getBalance());
	}

	// ���
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		System.out.print("���¹�ȣ ");
		String ano = scanner.nextLine();
		System.out.print("��ݾ� ");
		int b = scanner.nextInt();
		scanner.nextLine();
		Account ac= findAccount(ano);
		if(ac == null) {
			System.out.println("����� ��ҵǾ����ϴ�.");
			return;
		}
		
		ac.setBalance(ac.getBalance()-b);
		System.out.println("��� ����! ���� �ܾ�: "+ ac.getBalance());
	}

	// ���� ã��
	private static Account findAccount(String ano) {
		Account ac = null;
		for (int i = 0; i < accountArray.length; i++) {
			if( accountArray[i].getAno().equals(ano)) {
				ac = accountArray[i];
				return ac;
			}
		}
		System.out.println("��ġ�ϴ� ���¸� ã�� ����");
		return ac;
	}

}
