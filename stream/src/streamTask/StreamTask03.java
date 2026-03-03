package streamTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask03 {
	public static void main(String[] args) {
		
		User user1 = new User(1L, "홍길동", 20, "개발자", "남");
		User user2 = new User(2L, "장보고", 30, "기획자", "남");
		User user3 = new User(3L, "이순신", 35, "사장", "남");
		User user4 = new User(4L, "김영희", 25, "간호사", "여");
		User user5 = new User(5L, "김철수", 35, "소방관", "남");
		User user6 = new User(6L, "김영숙", 22, "유튜버", "여");
		
		
		List<User> user = Arrays.asList(user1, user2, user3, user4, user5, user6);
				
//		user 이름만 모두 붙혀서 출력
//		String str = user.stream()
//						.map(User::getName)
//						.collect(Collectors.joining(", "));
//		
//		System.out.println(str);
		
		
		
//		user 성별 남자면 man / 여자면 woman 붙이기
		
		user.stream().map(u -> u.getGender() + " : " + (u.getGender().equals("남") ? man : woman)).forEach(System.out::println);
				
	}

}
