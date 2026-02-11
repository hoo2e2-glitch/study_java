package whileTask;

import java.util.Scanner;

//사용자에게 무한 입력 상태로? 
//입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
//그리고 입력 받은 모든 값은 순서대로 출력한다
//ex)
//10
//50
//30
//-20
//10
//20

//프로그램 종료
//입력값: 10, 50, 30, -20, 10, 20

public class WhileTask02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String message = "숫자 입력하여 총합 100 만들기.\nex)10 50...", 
				endMessage = "총합 100 이상으로 프로그램 종료\n", 
				result = "입력값: %d + %d + %d + %d + %d = %d"; 
		System.out.println(message);
		// 40 30 10 10 10
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, total = 0;
		// int num = 0, total2 = 0;
		
		while(true) {
			// 숫자입력
			num1 = Integer.parseInt(sc.next());
			num2 = Integer.parseInt(sc.next());
			num3 = Integer.parseInt(sc.next());
			num4 = Integer.parseInt(sc.next());
			num5 = Integer.parseInt(sc.next());
			
			total = num1 + num2 + num3 + num4 + num5;
			
			if(total <= 100) {
				System.out.printf(result, num1, num2, num3, num4, num5, total);
			}else {
				System.out.print(endMessage);
				System.out.printf(result, num1, num2, num3, num4, num5, total);
				break;
			}
		}
		
		
		
		
	}

}
