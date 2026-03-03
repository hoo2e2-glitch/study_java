package streamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask {
	public static void main(String[] args) {

//		강사님 풀이
//		  public String addNamePrefix(String name) {
//		      return "이름 :" + name;
//		   }
		  
		User user1 = new User(1L, "홍길동", 20, "개발자", "남");
		User user2 = new User(2L, "장보고", 30, "기획자", "남");
		User user3 = new User(3L, "이순신", 35, "사장", "남");
		User user4 = new User(4L, "김영희", 25, "간호사", "여");
		User user5 = new User(5L, "김철수", 35, "소방관", "남");
		User user6 = new User(6L, "김영숙", 22, "유튜버", "여");
		
		
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
		
//		이름만 출력
//		이름: 홍길동
//		users.forEach((user) -> {System.out.println("이름: " + user.getName());});
		
//		강사님 풀이
//	    users.stream().map((user) -> "이름: " + user.getName()).forEach((name) -> { System.out.println(name);});

//		※ ↓ 참조형으로 변경하기
//		users.stream().map(User::getName).forEach(System.out::println);
//		users.stream().map((user) -> "이름: " + user.getName()).forEach(System.out::println);
		
//		강사님풀이
//	    StreamTask st = new StreamTask();
//	    users.stream().map(User::getName).map(st::addNamePrefix).forEach(System.out::println);
	      
	
//		.filter(): 조건식을 만족하는 값을 반환해서 Stream 으로 return.
//		users.stream().filter((user) -> user.getAge() >= 20 && user.getAge() <= 29).forEach(System.out::println);
		
//      "김"씨 성을 가진 유저만 출력
//		users.stream().filter(user -> user.getName().equals("김")).forEach(System.out::println);
//		users.stream().filter(user -> user.getName().charAt(0) == '김').forEach(System.out::println);
		
//		강사님 풀이
		MyFind myFind = (user) -> user.getName().startsWith("김");
	      users.stream().filter(myFind::isStartName).forEach(System.out::println);
				
//		30대 유저의 직업만 거꾸로 뒤집어 출력
//		"자획기"
//		"관방소"				
		
//		리스트.stream()
//	      .filter(조건)
//	      .map(변환)
//	      .forEach(출력);
		
		users.stream().filter((user) -> user.getAge() >= 30 && user.getAge() <= 39)
						.map(User::getJob)
//						StringBuilder 만들면서 값을 변경 가능
						.map(job -> new StringBuilder(job).reverse().toString())
						.forEach(System.out::println);
	
//		
//		MyFind02 myFind2 = (user) -> user.getAge().reverse().
//									.filter(user -> user.getJob())
//									.map(users.reverse(users)).forEach(System.out::println);
		
		
		
		MyFind02 myFind2 =
		        user -> new StringBuilder(user.getJob()).reverse().toString();
		        
		        users.stream()
		        .filter(user -> user.getAge() >= 30 && user.getAge() < 40)
		        .map(myFind2::reverseJob)
		        .forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
