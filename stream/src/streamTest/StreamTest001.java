package streamTest;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest001 {
	public static void main(String[] args) {
		
//		IntStream : 숫자들이 컨베이어 벨트 위에서 자동으로 흘러옴
//		핵심: IntStream = 숫자 전용 Stream! 그냥 for문을 더 간결하게 쓰는 것
		
		
//		IntStream.rangeClosed(1, 5)
//        ↓
//  	1 2 3 4 5 가 줄을 섬
//        ↓
//  	.filter / .map 으로 가공
//        ↓
//  	.forEach 로 출력
		
//		.map() - stream 반환
		IntStream.range(1, 10).map(i -> i * 2).forEach(System.out::println); // 2배
//		.filter() - stream 반환
		IntStream.range(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println); // 짝수
//		.sum()은 int 반환
		int sum = IntStream.range(1, 10).sum(); // 전부더하기
		System.out.println("합: " + sum);
//		.average()는 OptionalDouble 반환
		double aver = IntStream.range(1, 10).average().getAsDouble(); // 평균
		System.out.println("평균: " + aver);

//		핵심: 중간 연산은 Stream을 반환하고, 최종 연산은 Stream을 소비해요!
//		[소스]            [중간 연산]            [최종 연산]
//				IntStream.range()  .map().filter()  →  .forEach() / .sum() / .average()
//				  (데이터 생성)      	(가공/변환)           (소비 후 종료)
		
		
//		.map() : 그냥 값 변환이면
//		Stream<T> → Stream<R>
//		List<String> names = List.of("Tom", "Jane", "Mike");
//		결과타입 : Stream<Integer> // 객체 Integer
//		Stream<Integer> stream = names.stream()
//		                              .map(String::length);
		
//		.mapToInt() : 숫자 계산할 거면
//		Stream<T> → IntStream
//		결과타입 : IntStream // 기본형 int
//		IntStream stream = names.stream()
//        .mapToInt(String::length);
		
//		.mapToObj() : 숫자를 문자열로 바꿀 때, 숫자로 객체 생성할 때 
//		int → 원하는 객체(String,User)
//		IntStream → Stream<T>
		
//		String result =
//			    IntStream.rangeClosed(1, 5)
//			             .mapToObj(String::valueOf)
//			             .collect(Collectors.joining(", "));
//
//			System.out.println(result);
		
		
		
//		collect(), Collectors
//		Stream 객체의 형변환
		
//		ArrayList -> String
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
		System.out.println(datas1);
		
//		통채로 리턴타입/문자열값
		String str = datas1.stream() // ArrayList<Integer> → Stream<Integer>
					.map(String::valueOf) // Integer → String
					.collect(Collectors.joining(", ")); // Stream<String> → 하나의 String으로 합침
		
		System.out.println(str);
		
//		ArrayList<Integer>
//        ↓ stream()
//		Stream<Integer>
//		        ↓ map(String::valueOf)
//		Stream<String>
//		        ↓ collect(joining(", "))
//		String
	}
	
	

}
