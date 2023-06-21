package problems;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// 1. 가위바위보게임
		//  - 1.가위 2.바위 3.보에서 번호를 입력하고, random으로 나오는 값(1.가위 2.바위 3.보)과 비교하여 
		//이겼는지, 비겼는지, 졌는지 출력하시오.
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int choice,player, computer, keep, round=0;
		boolean check = true, checkG=true;
		
		
		while(check) {
			System.out.println("\n\n게임!");
			System.out.println("====================================");
			System.out.println("1.가위바위보게임\n2.업다운게임\n3.산수게임\n4.게임이용횟수\n5.종료");
			System.out.print(">>>");
			choice=sc.nextInt();
			System.out.println("====================================");
			
			switch(choice) {
			case 1:{
				while(checkG) {
				System.out.println("\n*** 가위바위보 게임 ***");
				System.out.println("1.가위\n2.바위\n3.보");
				System.out.print("나: ");
				player=sc.nextInt();
				computer=r.nextInt(4);
				if(player==1) {
					if(computer==1) {
						System.out.println("나: 가위, 컴퓨터: 가위\n비겼습니다!");
					}else if(computer==2) {
						System.out.println("나: 가위, 컴퓨터: 바위\n졌습니다ㅠㅠ");
					}else if(computer==3) {
						System.out.println("나: 가위, 컴퓨터: 보 \n이겼습니다!");
					}
				}else if(player==2) {
					if(computer==1)
						System.out.println("나: 바위, 컴퓨터: 가위\n이겼습니다!");
					else if(computer==2)
						System.out.println("나: 바위, 컴퓨터: 바위\n비겼습니다!");
					else if(computer==3) 
						System.out.println("나: 바위, 컴퓨터: 보 \n졌습니다ㅠㅠ");
				}else if(player==3) {
					if(computer==1)
						System.out.println("나: 보 ,컴퓨터: 가위\n졌습니다ㅠㅠ");
					else if(computer==2)
						System.out.println("나: 보 ,컴퓨터: 바위\n이겼습니다!");
					else if(computer==3)
						System.out.println("나: 보 ,컴퓨터: 보 \n비겼습니다!");
				}
				System.out.println("\n계속 하시겠습니까? (1(계속) / 0(나가기)");
				keep=sc.nextInt();
				if(keep==1) {
					checkG=true;
					round++;
				}
				else if(keep==0) {
					checkG=false;
					round++;
				}
				}//while
				break;
			}//case1
			case 2:
			case 3:
			case 4:{
				System.out.println("게임 이용 회수: "+round);
				break;
			}
			case 5:
			}//switch
		}//while
		
		
		
		
		
		
	
		
		

	

}
}
