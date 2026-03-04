package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTask04 {
	
	public static String changeToZero(int n) {
		return String.valueOf((char)(n + 65));
	}
	
	public static void main(String[] args) {
		
//      모두 Stream 문법으로 활용
		
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum); 
//		강사님 풀이
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
//      IntStream
//         .rangeClosed(1, 10)
//         .mapToObj(Integer::valueOf)
//         .collect(Collectors.toList())
//         .forEach(System.out::println);
      
		
		
//      2. ABCDEF를 각각 문자 별로 출력
		String data2 = "ABCDEF";
		data2.chars().mapToObj(c -> (char)c).forEach(System.out::print);
//		강사님 풀이
//      2. ABCDEF를 각각 문자 별로 출력
//      String data2 = IntStream
//         .range(0, 6)
//         .mapToObj(StreamTask4::changeToZero)
//         .collect(Collectors.joining(""));
//      System.out.println(data2);
		
		
//      3. ABDEF를 문자열로 출력
		String str = data2.chars().mapToObj(c -> (char)c).filter(c -> c != 'C').map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(str);
//		강사님 풀이
//      3. ABDEF를 문자열로 출력
//      String data3 = IntStream
//         .range(0, 5)
//         .map(n -> n > 1 ? n + 1 : n)
//         .mapToObj(StreamTask4::changeToZero)
//         .collect(Collectors.joining(""));
//      
//      System.out.println(data3);
		
		
//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력 ((i + 1) * 2 - 1)
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 1).forEach(System.out::println);
//		강사님 풀이
//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
//      IntStream
//         .rangeClosed(1, 50)
//         .mapToObj(n -> n * 2 - 1)
//         .collect(Collectors.toList())
//         .forEach(System.out::println);
//      
//      Integer[] arr = new Integer[50];
//      for(int i = 0; i < arr.length; i++) {
//         arr[i] = (i + 1) * 2 - 1;
//      }
//      
//      ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList(arr));
//      
//      datas3.addAll(Arrays.asList(arr));
//      System.out.println(datas3);
		
		
		
//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk // 초기값을 알고있을때 ArrayList
		
		String data3 = "Black WHITE reD yeLLow PINk apPle";
		String str2 = data3.chars().map(Character::toLowerCase).mapToObj(c -> (char)c).map(String::valueOf).collect(Collectors.joining(", "));
		System.out.printf("소문자: %s", str2);
		long count = data3.chars().map(Character::toLowerCase).filter(c -> c == 'a').count();
		System.out.printf("a개수: %s", count);
//		강사님 풀이
//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk, apple
//      ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Blasack", "WHITE", "reD", "yeLLow", "PINk", "apple"));
//      int aCount = datas5
//         .stream()
//         .map(String::toLowerCase)
//         .filter(lowercase -> lowercase.contains("a"))
//         .map(str -> str.chars()
//               .filter(c -> c == 97)
//               .mapToObj(c -> String.valueOf((char)c))
//               .collect(Collectors.joining(""))
//         )
//         .collect(Collectors.joining("")).length();
//      
//      System.out.println(aCount);
//      
//      int aCount2 = datas5
//         .stream()
//         .map(String::toLowerCase)
//         .filter(lowercase -> lowercase.contains("a"))
//         .map(str -> str.chars()
//               .filter(c -> c == 97)
//               .mapToObj(c -> String.valueOf((char)c))
//               .collect(Collectors.joining(""))
//               .length()
//         )
//         .mapToInt(n -> n)
//         .sum();
//      
//      System.out.println(aCount2);
//      System.out.println(datas5);
		
		
//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      Apple, banana, Melon, tomato 
//		String data4 = "Apple, banana, Melon, tomato";
//		ArrayList<String> data4 = new ArrayList<String>(List.of("Apple", "banana", "Melon", "tomato"));
		ArrayList<String> data4 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
//		Stream<Object> stream = data4.stream().filter();
		data4.stream().filter((w) -> w.charAt(0) >= 'A').filter((w) -> w.charAt(0) <= 'Z').forEach(System.out::println);
//		강사님 풀이
//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      "Apple", "banana", "Melon", "tomato"
//      ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
//      datas6
//         .stream()
//         .filter((str) -> str.charAt(0) >= 'A')
//         .filter((str) -> str.charAt(0) <= 'Z')
//         .forEach(System.out::println);
		
		
//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
		String data5 =  "공일이삼";
		data5.chars().mapToObj(c -> (char)c).map(String::valueOf).forEach(System.out::println);
//		data5.chars().mapToObj(c -> (char)c).map(c -> data5.indexOf(c)).forEach(System.out::print);
//		강사님 풀이
//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
//      String hangle = "공일이삼사오육칠팔구", message = "한글을 입력하세요.\nex)공일이삼", input = null;
//      Scanner sc = new Scanner(System.in);
//      System.out.println(message);
//      input = sc.next();
//      input.chars().map(hangle::indexOf).forEach(System.out::print);
		
//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼"
		String data6 =  "0123";
		data6.chars().mapToObj(c -> (char)c).map(c -> String.valueOf(data6)).forEach(System.out::print);
		data6.chars().mapToObj(c -> (char)c).map(String::valueOf).forEach(System.out::println);
//		강사님 풀이
//		8. 정수를 한글로 변경
//		"0123" -> "공일이삼"
		String hangle = "공일이삼사오육칠팔구", message = "정수를 입력하세요.\n0123", input = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		input = sc.next();
		
		input.chars().map(c -> c - 48)
		.map(hangle::charAt)
		.mapToObj(c -> String.valueOf((char)c))
		.forEach(System.out::print);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
