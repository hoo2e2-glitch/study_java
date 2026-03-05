package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask002 {
	public int number = 10;
	
	public static int square(int n) {
		return n * n;
		
	}
	public int getNumber() {
		return number;
		
	}
	
	public static void main(String[] args) {
		
		// 헷갈리는 포인트!
		// static 키워드가 있으면 → 클래스명
		// static 키워드가 없으면 → new 객체
		
		StreamTask002.square(5); // → static 메서드 클래스명으로 호출	
		System.out.println(StreamTask002.square(5));

		new StreamTask002().getNumber(); // → 인스턴스 → 반드시 객체 생성 후 호출
		System.out.println(new StreamTask002().getNumber());
		
//		1️. 어디서 stream 만들지
//		2️. 어떤 값 꺼낼지 (map)
//		3️. 조건 있는지 (filter)
//		4️. 최종 목표 (sum / collect / forEach)
//		5️. 타입 맞는지 확인
//		stream → filter → map → 최종연산
		
//		배열 기반 List / 크기 변경 불가능 / 값 수정은 가능 .set()
		List<String> name = Arrays.asList("홍길동", "이순신", "장보고");
		
		String result = name.stream().collect(Collectors.joining(", "));
		System.out.println(result);
		
//		완전 불변 리스트 (immutable) / add / remove / set 전부 불가능
		List<String> name1 = List.of("홍길동", "이순신", "장보고");
		
//		완전히 수정 가능 / add / remove / set 가능
		List<String> name2 = new ArrayList<String>(Arrays.asList("홍길동", "이순신", "장보고"));
		
//		list에서 최댓값
		List<Integer> list = Arrays.asList(10, 20, 50, 30, 40);

		int max = list.stream()
		              .mapToInt(i -> i)
		              .max().getAsInt(); // OptionalInt라서 getAsInt() 필요! // OptionalInt → int 변환

		System.out.println(max);

	}

}
