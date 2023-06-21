package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class re_Q1 {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		boolean check = true;
		String menu=null;
		int price, choice;
		
		while(check) {
			System.out.println("\n\n1.메뉴등록\n2.메뉴별 가격 보기\n3.종료");
			System.out.print(">>>");
			choice=input.nextInt();
			
			switch(choice) {
			case 1:{//메뉴등록
				System.out.print("\n등록할 메뉴 이름 입력: ");
				menu = input.next();
				System.out.print("등록한 메뉴의 가격 입력: ");
				price = input.nextInt();
				map.put(menu, price);
				System.out.println("등록되었습니다.");
				break;
			}//case1
			case 2:{//메뉴별 가격 보기
				Set<String> set = map.keySet();
				Iterator<String> it = set.iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+":"+map.get(key));
				}
				System.out.println("1.수정\n2.삭제\n3.나가기");
				System.out.println(">>>");
				choice=input.nextInt();
				switch(choice) {
				case 1:{//수정
					System.out.print("수정할 메뉴 이름 입력: ");
					menu=input.next();
					System.out.print("수정할 메뉴의 가격 입력: ");
					price=input.nextInt();
					if(map.containsKey(menu)) { //만약 map에 menu와 같은 값이 있다면??
						map.put(menu, price); //방금 입력한 값으로 저장
					}else {//없다면??
						System.out.println("메뉴없음");
					}
					break;
				}//case1
				case 2:{//삭제
					System.out.print("삭제할 메뉴 이름 입력: ");
					menu=input.next();
					if(map.containsKey(menu)) {
						map.remove(menu);
					}else {
						System.out.println("메뉴없음");
					}
					break;
				}//case2
				case 3:{break;}
				}//switch
				break;
			}//case 2
			case 3:{//종료
				System.out.println("프로그램을 종료합니다.");
				check = false;
			}//case3
			}//switch
		}//while

	}

}
