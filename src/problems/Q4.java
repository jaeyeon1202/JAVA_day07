package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		//중복제거하기
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int num1;
		int[] n;
		int nn;
		
		System.out.print("첫 번째 줄 입력 정수: ");
		num1=input.nextInt();
		
		System.out.print("길이가 n인 정수배열 입력: ");
		String num = input.next(); //길이가 n인 정수배열을 string타입으로 받고 
		String[] num_arr=num.split(" ");//공백을 기준으로 split으로 자른다 //자른걸 정수로 변환 후 배열에 저장
		for(int i=0; i<num_arr.length;i++) {
			//n[i] = Integer.parseInt(num_arr[i]);
			//System.out.println(nn);
		}

	}

}
