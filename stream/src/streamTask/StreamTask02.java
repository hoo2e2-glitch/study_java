package streamTask;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.management.ValueExp;

public class StreamTask02 {
	public static void main(String[] args) {
		
//      a...z까지 ArrayList에 담고
//      "acegi..." 문자열로 출력
//		기본문법 쓰고 참조로 넘어감
		
		ArrayList<Character> data = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(c -> data.add((char)c));
		
		System.out.println(data);
		
		
//		Character str = data
//			.chars()
//			.filter(i -> i % 2 == 0)
//			.mapToObj((c) -> (char)c)
//			.map(String::valueOf)
//			.collect(Collectors.joining(", "));
//		
//			System.out.println(str);
			
			
			String str2 = IntStream.range(0, data.size())
			.filter(i -> i % 2 == 0)
//			.mapToObj((c) -> (char)c)
			.mapToObj(data::get)
			.map(String::valueOf)
			.collect(Collectors.joining(""));
			
			System.out.println(str2);

//			강사님 풀이
//		     String result = IntStream
//		             .rangeClosed(0, 25)
//		             .map(StreamTask2::add97)
//		             .filter(StreamTask2::isOdd)
//		             .mapToObj(StreamTask2::valueOf)
//		             .map(String::valueOf)
//		             .collect(Collectors.joining(""));
//		          
//		       System.out.println(result);
			
			
		
		
		
	}

}
