package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q01 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		Set<String> set = map.keySet();
		
		boolean check =true;
		int choice, price, choice2, m_price;
		String menu=null, r_menu=null, m_menu=null;
		
		while(check) {
			System.out.println("\n\n1.메뉴등록\n2.메뉴별 가격보기\n3.종료");
			System.out.print("선택: ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1:{//메뉴등록
				System.out.print("메뉴입력: ");
				menu=input.next();
				System.out.print("가격입력 ");
				price=input.nextInt();
				map.put(menu, price);
				break;
			}//case1
			case 2:{//메뉴별 가격 보기
				Iterator<String>it = set.iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+":"+map.get(key));
				}//while
				System.out.println("\n1.수정\n2.삭제\n3.나가기");
				choice2=input.nextInt();
					switch(choice2) {
					case 1:{//수정
						System.out.print("수정할 메뉴 이름 입력: ");
						m_menu=input.next();
						System.out.print("수정할 메뉴의 가격 입력: ");
						m_price=input.nextInt();
							if(map.containsKey(m_menu)) {//comtainsKey: map안에 key값이 있는지 없는지
								map.put(m_menu, m_price);
							}else {
								System.out.println("메뉴없음.");
							}
						break;
					}//case1
					case 2:{//삭제
						System.out.print("삭제할 메뉴 입력: ");
						r_menu=input.next();
						if(map.containsKey(r_menu)) {
							map.remove(r_menu);
						}else {
							System.out.println("삭제할 메뉴 없음");
						}
					}
					case 3:{//나가기
						break;
					}//case3
					}//switch-2
					break;
			}//case2
			case 3:{//종료
				System.out.println("프로그램을 종료합니다");
				check=false;
			}//case3
			}//switch
		}//while

	}//main

}//class
