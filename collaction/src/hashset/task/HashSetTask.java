package hashset.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTask {
	   public static void main(String[] args) {
//	      "banana", "apple", "orange", "apple", "banana"
//	      문자열 ArrayList가 존재할 때 중복이 되지 않는 글자만 연결하여 출력하기
//	      ex) 출력 결과: banpleorg
	      
//		 중복값 삭제
	     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("banana", "apple", "orange", "apple", "banana"));
	      
	     datas = new ArrayList<String>(new HashSet<String>(datas));
	     System.out.println(datas);	
	     
//	     나머지 붙이기
	     HashSet<Character> set = new HashSet<Character>();
	     
//	     반복돌려서 넣기
	     for(String aa : datas) {
	    	 for(char c :  aa.toCharArray()) {
	    		 set.add(c);
	    	 };
	     };
	     
	     System.out.println(set);	
	     
	     
//	     결과넣기
	     ArrayList result = new ArrayList();
	     	
	     for(char c : set) {
	    	 result += c;
	     };
	     
	     System.out.println(result);
	      
		  
	   }
}
