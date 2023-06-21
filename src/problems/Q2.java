package problems;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		
		//로도 번호 뽑기
		int[] mynum = new int[6];
		for(int i=0; i<mynum.length; i++) {
			System.out.print("입력"+i+":");
			mynum[i]=input.nextInt();
			if(mynum[i]>45 || mynum[i]<0) {
				System.out.println("다시 뽑으세요(0~45사이 숫자만 가능)");
				i--;
			}//if
			for(int j=0; j<i; j++) {
				if(mynum[i]==mynum[j]) {
					System.out.println("중복숫자 입력");
					i--;
				}//if
			}//for
		}//for
		
		//내가 뽑은 로또번호 확인
		for(int i=0; i<6; i++) {
			System.out.print(mynum[i]+" ");
		}
		
		//랜덤 로또번호 뽑기
		int lotto[] = new int[6];
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=r.nextInt(46);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}//if
			}//for
		}//for
		
		//랜덤 로또번호 확인
		System.out.println("\n\n당첨번호");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		//맞은 개수
		int count=0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				if(mynum[i]==lotto[i]) {
					count++;
				}
			}
			
		}
		
		switch(count){
		case 6:System.out.println("\n\n1등");
		case 5:System.out.println("\n\n2등");
		case 4:System.out.println("\n\n3등"); 
		case 3:System.out.println("\n\n4등");
		case 2:System.out.println("\n\n5등");
			default:System.out.println("\n\n꽝");
				
		}
	}

}
