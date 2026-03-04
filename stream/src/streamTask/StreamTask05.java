package streamTask;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask05 {
	
	public static String Introduce(Member member) {
		return "이름: " + member.getName() + "\n" + "취미: " + member.getHobby() + "\n" + "소개" + member.getIntro() + "\n";
	}
	
	public static void main(String[] args) {
		
		
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
		
		
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 이름과 취미를
//      아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
//
//      필드 : 이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
		Member member1 = new Member(1L, "홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member(2L, "이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member(3L, "장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member(4L, "김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member(5L, "김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member(6L, "흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		List<Member> members = Arrays.asList(member1, member2, member3, member4, member5, member6 );
//		다양하게 넣을 수 있다.
//		Member[] memberArr = new Member[] {member1, member2, member3, member4, member5, member6};
//		ArrayList<Member> members = new ArrayList<Member>();
//		members.addAll(Arrays.asList(memberArr));
		
//		개발을 좋아하는 사람의 이름과 취미를 아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
		members.stream().filter(m -> m.getHobby().contains("개발")).map((n) -> "이름: " + n.getName() + "\n" + "취미: " + n.getHobby().replaceAll("_", ", ")).forEach(System.out::println);
//		map((m) -> "이름: " + m.getName()).forEach(System.out::println);
//		members.stream().filter(m -> m.getHobby().contains("개발")).map((h) -> "취미: " + h.getHobby().replace("_", ", ")).forEach(System.out::println);
		
//      3) 취미를 3개 이상 가진 사람의 id를 출력
		members.stream().filter(h -> h.getHobby().split("_").length >= 3).map((i) -> "3가지 취미: " + i.getId() + "번").forEach(System.out::println);
     
//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds에 담기
		List<String> hobbyIds = members.stream().filter(h -> h.getHobby().split("_").length >= 3).map((i) -> "3가지 취미: " + i.getId() + "번").collect(Collectors.toList());
		System.out.println(hobbyIds);
		
//		ArrayList
		ArrayList<Long> hobbyIds2 = members
				.stream()
				.filter(member -> member.getHobby().split("_").length >= 3)
				.map(member -> member.getId())
				.collect(Collectors.toCollection(ArrayList::new));
//				.collect(Collectors.toCollection(() -> new ArrayList<Long>()));
		
		hobbyIds2.forEach(id -> {System.out.println(id);});
		
//		HashMap
		HashMap<Long, Long> Longs = members
				.stream()
				.filter(member -> member.getHobby().split("_").length >= 3)
				.map(member -> member.getId())
				.collect(Collectors.toMap(
						id -> id, 
						id -> id,
						(a, b) -> a,
						() -> new HashMap<Long, Long>()));


		
//      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개 출력하기
//		Object hobbyIds2 = members.stream().filter( -> ).forEach(System.out::println);
		members.stream().filter(j -> hobbyIds.contains(j.getId())).map(Member::getIntro).forEach(System.out::println);
		

				
//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//      출력 예시)
//         이름: 흰둥이
//         취미: 개발_축구_농구
//         소개: 개발도 운동도 다 잘해요!
		String whiteIntro = members.stream().filter(h -> h.getIntro().length() > 13).map(Member::getName).collect(Collectors.joining());
		System.out.println("이름: " + whiteIntro);
		members.stream().filter(h -> h.getIntro().length() > 13).map(intro -> "이름: " + intro.getName() + "\n" + "취미: " + intro.getHobby() + "\n" + "소개" + intro.getIntro() + "\n").collect(Collectors.toList()).forEach(System.out::println);
		members.stream().filter(h -> h.getIntro().length() > 13).map(StreamTask05::Introduce).collect(Collectors.toList()).forEach(System.out::println);
//		members.stream().filter(h -> h.getIntro().length() > 13).map(intro -> "소개: " + intro.getIntro()).collect(Collectors.toList()).forEach(System.out::println);;
//		members.stream().filter(h -> h.getIntro().length() > 13).map(Member::getIntro).collect(Collectors.toList()).forEach(System.out::println);;
		//길이 int
//		members.stream().max(Comparator.comparingInt(m -> m.getIntro().length()));
		Optional<Member> member =
		members.stream().max(Comparator.comparingInt(m -> m.getIntro().length()));
		System.out.println(member);
		
		member.ifPresent((m) -> {System.out.println(m);});
		
   }
}