package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Object[]> map = new HashMap<>();
		Iterator<Integer> it ;
		Random r = new Random();
		
		
		String order;
		boolean flag = true;
		int stu=0, count=1, id=0;
		
		while(flag) {
			System.out.print("\n명령어 입력: ");
			order=sc.next();
			
			
			switch(order) {
			case "count":{
				System.out.print("등록할 학생 수 입력: ");
				stu = sc.nextInt();
				break;
			}
			case "insert":{
				if(stu==0) {
					System.out.println("학생 수를 먼저 입력하세요.(count)");
				}
				for(int i=0; i<stu; i++) {
					Object[] info = new Object[5]; //이름,주소,국,영,수 =>5개
					System.out.print("이름 입력: ");
					info[0]=sc.next(); //info[0]:이름
					System.out.print("주소 입력: ");
					info[1]=sc.next();
					System.out.print("국어 점수 입력: "); //*nextInt가 아닌가..?
					info[2]=sc.nextInt();//java.util.InputMismatchException
					System.out.print("영어 점수 입력: ");
					info[3]=sc.nextInt();
					System.out.print("수학 점수 입력: ");
					info[4]=sc.nextInt();
					map.put(id++, info); //*nextInt가 안되서 저장된거 확인못함
				}
				break;
			}
			case "print":{ //*오류
				it=map.keySet().iterator();
				while(it.hasNext()) {
					id = it.next();
				
				System.out.println("★"+ map.get(id)[0]+"학생("+id+")의 정보★");
				//java.lang.NullPointerException: 
				//Cannot load from object array because the return value of 
				//"java.util.HashMap.get(Object)" is null
				//for(int i=0; i<map.size(); i++) {
					System.out.println("\n이름: "+ map.get(id)[0]);//+로바꾸기
					System.out.println("\n학번: "+ id);
					System.out.println("\n주소: "+ map.get(id)[1]);
					System.out.printf("\n국어점수: "+ map.get(id)[2]);
					System.out.printf("\n영어점수: "+ map.get(id)[3]);
					System.out.printf("\n수학점수: "+ map.get(id)[4]);
					
					int sum = (int)(map.get(id)[2]) + (int)(map.get(id)[3])+(int)(map.get(id)[4]);
					System.out.printf("\n총점: %d", sum);
					System.out.printf("\n평균: %d", sum/3);
				}
				///}
				break;
			}
			case "search":{
				System.out.print("검색할 학생의 학번 입력: ");
				id=sc.nextInt();
				if(map.get(id)==null) {
					System.out.println("학생 정보가 없습니다.");
				}
				System.out.printf("\n이름: %s", map.get(id)[0]);
				System.out.printf("\n학번: %d", id);
				System.out.printf("\n주소: %s", map.get(id)[1]);
				System.out.printf("\n국어점수: %s", map.get(id)[2]);
				System.out.printf("\n영어점수: %s", map.get(id)[3]);
				System.out.printf("\n수학점수: %s", map.get(id)[4]);
				break;
			}	
			case "modify":{
				System.out.print("\n검색할 학생의 학번 입력: ");
				id=sc.nextInt();
				if(map.get(id)==null) {
					System.out.println("존재하지 않는 학생");
				}
				Object[] info = new Object[5];
				System.out.print("이름 입력: ");
				info[0]=sc.next(); 
				System.out.print("주소 입력: ");
				info[1]=sc.next();
				System.out.print("국어 점수 입력: "); 
				info[2]=sc.nextInt();
				System.out.print("영어 점수 입력: ");
				info[3]=sc.nextInt();
				System.out.print("수학 점수 입력: ");
				info[4]=sc.nextInt();
				map.put(id, info);
				System.out.println("정보가 수정되었습니다.");
				break;
			}
			case "remove":{
				System.out.print("삭제할 학생의 학번 입력: ");
				id=sc.nextInt();
				if(map.get(id)==null) {
					System.out.println("존재하지 않는 학생입니다.");
				}
				System.out.printf(map.get(id)[0]+"학생은 퇴학처리 되었습니다.");
				map.remove(id);
				//NullPointerException *오류
				break;
			}
			case "event":{ //한명만
				//System.out.printf("이벤트 당첨 학생의 학번: %d", r.nextInt(stu+1));
				int ran = r.nextInt(stu+1);
				System.out.println("경축! 이벤트에 당첨되셨습니다.");
				System.out.printf("\n이름: %s", map.get(ran)[0]);
				System.out.printf("\n학번: %d", ran);
				System.out.printf("\n주소: %s", map.get(ran)[1]);
				
				System.out.printf("\n국어점수: %d", (int)(map.get(ran)[2])+10);
				System.out.printf("\n영어점수: %d", (int)(map.get(ran)[3])+10);
				System.out.printf("\n수학점수: %d", (int)(map.get(ran)[4])+10);
				break;
			}
			}
		}
	}

}
