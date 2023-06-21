package problems;

import java.util.Random;
import java.util.Scanner;

public class re_Q2 {

	public static void main(String[] args) {
		// 로또 번호 6개 입력 -> 1~45랜덤추출 ->내꺼랑 비교 -> 1~5등
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		//로또 번호 6개 입력
		int mynum[] = new int[6];
		for(int i=0; i<mynum.length;i++) {
			System.out.print(i+"번호입력: ");
			mynum[i]=input.nextInt();
			if(mynum[i]>45 || mynum[i]<0) {
				System.out.println("다시뽑기(범위초과)");
				i--;
			}
			for(int j=0; j<i; j++) {
				if(mynum[i]==mynum[j]) {
					System.out.println("다시뽑기(중복)");
					i--;
				}
			}
		}
		
		//내 번호 확인
		System.out.print("내가 뽑은 번호: ");
		for(int i=0; i<mynum.length;i++) {
			System.out.print(mynum[i]+" ");
		}
		
		//당첨 번호 뽑기
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=r.nextInt(46);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//당첨 번호 확인
		System.out.print("\n\n당첨 번호: ");
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		//담청된 갯수
		int count =0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<i;j++) {
				if(mynum[i]==lotto[j]) {
					count++;
				}
			}
		}
		System.out.println("\n\ncount: "+count);
		
		//순위
		switch(count) {
		case 6:System.out.println("1등");
		case 5:System.out.println("2등");
		case 4:System.out.println("3등");
		case 3:System.out.println("4등");
		default:System.out.println("꽝");
		}
	}

}
