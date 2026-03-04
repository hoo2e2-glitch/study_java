package streamTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

// JDK 8 API
// map - 바꿈
// filter - 걸러냄
// forEach - 반복

public class StreamTest {
	public static void main(String[] args) {
		
//		IntStream: 숫자(정수)를 이용한 Stream 문법을 사용할 수 있게 제공해주는 인터페이스(객체)
//		range(): 반복할 수 있게 횟수(범위)를 만들어주는 메서드
//		IntStream.range(0, 10).forEach((num) -> { System.out.println(num);} );
//		IntStream.rangeClosed(1, 20).forEach((num) -> {System.out.println(num);});
		
		// 람다식 → 중괄호 {} 안에 '실행할 코드' 를 써야 함
//		안됨
//		IntStream.rangeClosed(1, 20).forEach((num) -> {(System.out::print)});
//		가능
//		IntStream.rangeClosed(1, 20).forEach(System.out::print);
//		IntStream.rangeClosed(1, 20).forEach((num) -> { System.out.println(num); });
		
//		ArrayList();
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((num) -> { number.add(num); });
//		
//		number.forEach((num) -> { System.out.println(num); });
		
		
//      .forEach()
//      1. numbers2를 ArrayList 생성
//      2. 1~50까지 짝수만 numbers2에 추가하고 모두 출력하기
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 50)
//		   			.forEach((num) -> { if(num % 2 == 0) {numbers2.add(num);}
//		   			});
//		   참조형 : 코드가 아니다
//			.(객체명::메서드명)
//		   numbers2.forEach(System.out::println);
		   
		   
//	      ArrayList numbers3를 생성하고
//	      참조형으로 numbers3에 1~10까지 값을 추가하기
//		  ArrayList<Integer> numbers3 = new ArrayList<Integer>();
//		  IntStream.rangeClosed(1, 10).forEach((num) -> { numbers3.add(num);});
//		  numbers3.forEach(System.out::println);
		   
		   
//		   문자열 stream
//		   .chars()
//			문자 → 아스키/유니코드 값(int)
//		   String data = "ABCDEF";
//		   IntStream 반환 -> 숫자값으로 출력
//		   data.chars().forEach(System.out::println);
//		   다시 문자로 변환하려면
//		   data.chars().forEach((c) -> {System.out.println((char)c);});
		   
		   
//		   1. 참조를 하면 안되는 순간
//		   문자형 출력이 불가능 -> 목적에 맞지 않음
//		   data.chars().forEach((c) -> {System.out.println((char)c);});
//		
//		   2. 0삭제 -> 1번째 인덱스가 0번째 인덱스를 갖게된다.
//		   즉 삭제를 할 때 값을 건너뛰게 되어 참조형 사용이 불가능하다.
//		   ArrayList<Integer> numbers4 = new ArrayList<Integer>();
//		   IntStream.rangeClosed(1, 10).forEach(numbers4::add);
//		   System.out.println(numbers4);
//		   
//		   IntStream.range(1, 5).forEach(numbers4::remove);
//		   System.out.println(numbers4);
		
//			.map() : 기존 값을 다른 값으로 변경할 때 사용하는 메서드
//			** return이 반드시 필요하다.
//			1 ~ 10까지 추가 // 람다 콜백함수
//			ArrayList<Integer> numbers5 = new ArrayList<Integer>();
//			기능 > 변수에 담으면 안됨
//			리턴타입 확인
//			IntStream.range(0, 10).map((n) -> n + 1).forEach(numbers5::add);
//		   											(=.forEach(n -> numbers5.add(n));)
			
//	      	data를 "abcdefg"로 변경하여 출력
			String data = "ABCDEFG";
	      	
//	      	data.chars()
//	      	.mapToObj(c -> String.valueOf((char)c))  // 아스키코드 → 문자로 변환
//	      	.map(String::toLowerCase)                // 대문자 → 소문자
//	      	.forEach(System.out::print);
	      	
	      	data.chars().map(c -> c + 32).forEach((c) -> {System.out.print((char)c);});
//	      	Arrays.stream(data.split("")).map(String::toLowerCase).forEach(System.out::print); 
	
	      
	      
	      
	      
	      
		   
		   
		
		
		
	}
	
	
	
	

}
