package hashset.task;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetTask {
	   public static void main(String[] args) {
//	      "banana", "apple", "orange", "apple", "banana"
//	      문자열 ArrayList가 존재할 때 중복이 되지 않는 글자만 연결하여 출력하기
//	      ex) 출력 결과: banpleorg
	      
//		 중복값 삭제
	     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("banana", "apple", "orange", "apple", "banana"));
	      
	     datas = new ArrayList<String>(new HashSet<String>(datas));
	     System.out.println(datas);	
	     
	     Dedupe dedupe = (expression) -> {
				HashSet<String> dedupeHashSet = new HashSet<String>(expression);
				HashSet<Character> charHashSet = new HashSet<Character>();
				String result = "";
				
				for(String str: dedupeHashSet) {
					for(char c: str.toCharArray()) {
						charHashSet.add(c);
					}
				}
				
				for(char c: charHashSet) {
					result += c;
				}
				
				return result;
			};
			
			String result = dedupe.dedupe(datas);
			System.out.println(result);
		}
	}
