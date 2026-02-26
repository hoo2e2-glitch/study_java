package classTask;

import java.util.Scanner;
//슈퍼카(SuperCar) 클래스 생성
//브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔

	class SuperCar{
		String brand;
		String color;
		long price;
		boolean engine; //false
		String password;
		int errorCount;

	
	public SuperCar() {;}
//	 오버로딩
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}

	
//2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//3. 비밀번호 3회 오류시 경찰 출동
	void engineCheck(String inputPassword) {

		if(errorCount >= 3) {System.out.println("오류시 경찰 출동");
		return;
		}
//		비밀번호 일치
		if(inputPassword.equals(password)) {
		if(engine == false){ // 같냐? 비교
		engine = true; // 값을 대입
		System.out.println("엔진 켬");
		}else {
		engine = false;
		System.out.println("엔진 끔");
		}
		errorCount = 0;
//		비밀번호 틀림
		}else {
		errorCount++;
		System.out.println("비밀번호 오류" + errorCount + "회");
		
		if(errorCount >= 3) {System.out.println("오류시 경찰 출동");}
		}
	}	
}
	
//	강사님 풀이
//	class SuperCar {
//	   String brand;
//	   String color;
//	   long price;
//	   String password;
//	   int errorCount;
//	   boolean engine;
//
//	   public SuperCar() {;}
//	//   오버로딩
//	   public SuperCar(String brand, String color, long price) {
//	      this.brand = brand;
//	      this.color = color;
//	      this.price = price;
//	   }
//	   public SuperCar(String brand, String color, long price, String password) {
//	      this.brand = brand;
//	      this.color = color;
//	      this.price = price;
//	      this.password = password;
//	   }
//	   
//	//   스태틱 블럭
//	   static {
//	      System.out.println("출고 축하드립니다!");
//	   }
//	   
//	//   초기화 블럭
//	   {
//	      this.password = "0000";
//	   }
//	   
//	   void engineStart() {
//	      this.engine = true;
//	   }
//	   
//	   void engineStop() {
//	      this.engine = false;
//	   }
//	   
//	   boolean checkPassword(String password) {
//	      return this.password.equals(password);
//	   }
//	}
//
//	// 슈퍼카(SuperCar) 클래스 생성
//	// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
//
//
public class ClassTask02 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	SuperCar kia = new SuperCar("볼보", "노랑", 5000, "1234");
	
	while(true){
		System.out.println("\n비밀번호 입력 (종료: exit): ");
		String input = sc.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("프로그램 종료");
			break;
		}
		
		kia.engineCheck(input);
	}
	
	
// 		강사님 풀이
//     String message1 = "비밀번호를 입력하세요.\nex)1234", 
//           message2 = "1. 엔진 켜기\n2. 엔진 끄기",
//           password = null;
//     int choice = 0;
//     
//     
//  //   1. 슈퍼차 객체화
//     SuperCar bugatti = new SuperCar("부가티", "블루", 14_000_000_000L);
//     
//     while(true) {
////        2. 비밀번호를 입력,
//        System.out.println(message1);
//        password = sc.next();
//        
//        if(bugatti.checkPassword(password)) {
//           System.out.println("비밀번호 일치");
////           비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//           
//           System.out.println(message2);
//           choice = sc.nextInt();
//           
//           if(choice == 1) {
//              if(!bugatti.engine) {
//                 System.out.println("시동이 켜졌습니다.");
//                 bugatti.engineStart();
//              }else{
//                 System.out.println("이미 시동이 켜져있습니다.");
//              }
//              
//           }else if(choice == 2) {
//              if(bugatti.engine) {
//                 System.out.println("시동이 꺼졌습니다.");
//                 bugatti.engineStop();
//              }else{
//                 System.out.println("이미 시동이 꺼져있습니다.");
//              }
//              
//           }else {
//              System.out.println("잘못 입력했습니다.\n처음부터 다시 입력하세요.");
//           }
//           
//           
//        }else {
////           3. 비밀번호 3회 오류시 경찰 출동
//           if(bugatti.errorCount > 1) {
//              System.out.println("경찰 출동!");
//              break;
//           }
//           System.out.println("비밀번호 틀림");
//           bugatti.errorCount++;
//
//	
//	}
//
 //    }
}
}
