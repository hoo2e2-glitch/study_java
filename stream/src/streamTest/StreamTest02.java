package streamTest;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest02 {
	public static void main(String[] args) {
//		collect(), Collectors
//		Stream 객체의 형변환
		
//		ArrayList -> String
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas1::add);
		System.out.println(datas1);
		
//		통채로 리턴타입/문자열값
//		String str = datas1.stream() // ArrayList<Integer> → Stream<Integer>
//					.map(String::valueOf) // Integer → String
//					.collect(Collectors.joining(", ")); // Stream<String> → 하나의 String으로 합침
//		System.out.println(str);
		
//		mapToObj() : 기본 자료형 -> 클래스형 자료형으로 형변환시켜주는 스트림 메서트
		
//		String data = "ABCDEF";
//		"abcdef"
		
//		data.chars().map((c) -> c + 32)
//		mapToObj() : int -> char로 변환
//		.mapToObj((c) -> (char)c)
//		.forEach(System.out::println);
		
		
//		String str2 = data
//				.chars() // IntStream
//				.map((c) -> c + 32) // IntStream
//				.mapToObj((c) -> (char)c) // Stream<Character> // mapToObj() : int -> char로 변환
//				.map(String::valueOf) 
//				.collect(Collectors.joining(", "));
//		
//		System.out.println(str2);
		
//		int -> Integer 바로 변환x
//		IntStream // Stream<Integer> 다름!
		
//		IntStream -> ArrayList
//		타입 형변환 필요
//		1번
//		ArrayList // 구현이 다 안되서 생기는 오류 
//		List<Integer> datas = (ArrayList)IntStream
//				.range(0, 10)
//				.mapToObj((n) -> Integer.valueOf(n))
//				.collect(Collectors.toList());

//		2번
//		 IntStream
//				.range(0, 10)
//				.boxed()
//				.collect(Collectors.toList()) // 여기까지는 collect 메서드 // map 쓰고 싶으면 .stream() 사용 후 넣기
//				.stream()
//				.map((n) -> n + 1)
//				.forEach(System.out::println);
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
