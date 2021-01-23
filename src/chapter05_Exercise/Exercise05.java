package chapter05_Exercise;

import java.util.Scanner;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		Exercise05 ex = new Exercise05();
		ex.ex7();
		ex.ex8();
		ex.ex9();
		
	}

	public void ex7() {
		// 주어진 배열의 항목에서 최대값을 구해보세요(for문 이용)
		int max=0;
		int[] array = {1,5,3,8,2};
		// -----------
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max: "+max);
	}
	
	public void ex8() {
		// 주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩 for문 이용)
		int[][] array= {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum =0;
		double avg =0.0;
		//--------------
		int k=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				k += 1;
				sum += array[i][j];
				
			}
		}
		avg =(double) sum/k;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
	
	private void ex9() {
		// 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2){
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i]= scanner.nextInt();
				}
			}else if(selectNo == 3){
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
				
			}else if(selectNo == 4){
				int max=0, sum=0;
				double avg=0.0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
						
					}
				}
				avg =(double) sum/scores.length;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			}else if(selectNo == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
