package streamTask;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamTask001 {
	public static void main(String[] args) {
		
//		IntStream을 사용해서
//		1~100까지 숫자를 모두 더해서 출력하세요
//
//		출력 결과:
//		합계: 5050

		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);
		System.out.println(IntStream.rangeClosed(1, 100).sum());
		
//		users 리스트에서
//		나이가 30살 이상인 사람들의
//		평균 나이를 출력하세요
//
//		출력 결과:
//		평균 나이: 33.33...

		User user1 = new User(1L, "홍길동", 20, "개발자", "남");
		User user2 = new User(2L, "장보고", 30, "기획자", "남");
		User user3 = new User(3L, "이순신", 35, "사장", "남");
		User user4 = new User(4L, "김영희", 25, "간호사", "여");
		User user5 = new User(5L, "김철수", 35, "소방관", "남");
		User user6 = new User(6L, "김영숙", 22, "유튜버", "여");
		
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6);
		
//		OptionalDouble: 
//		aver                  // OptionalDouble[33.33...]  ← 껍데기째로 출력
//		aver.getAsDouble()    // 33.33...  ← 값만 꺼내서 출력
//		핵심: average() 는 OptionalDouble 을 반환하기 때문에 .getAsDouble() 로 값을 꺼내기 
		OptionalDouble aver = users.stream().filter((user) -> user.getAge() >= 30).mapToInt(User::getAge).average();
		
		System.out.printf("평균 나이: %.2f%n", aver.getAsDouble());
		
		
	}

}
