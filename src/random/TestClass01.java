package random;

import java.util.Random;

public class TestClass01 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("========================");
		for(int i=0; i<5; i++) {
			double ran = Math.random()*3; //0.0000~0.9999 ->*3 
			// -> 0.0000~2.999 -> (int)(0.000~2.999) -> 0~2
			System.out.println((int)ran);
		}
		//==============
		System.out.println("================");
		Random r = new Random(); //랜덤을 이용해서
		for(int i=0;i<5; i++) {
			int num = r.nextInt(3); //0~2 //nextInt을 이용해서 0~2까지의 랜덤 수 뽑기 (범위)
			System.out.println(num+1);
		}

	}

}
