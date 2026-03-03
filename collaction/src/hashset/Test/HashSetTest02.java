package hashset.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest02 {
	
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("estj");
		mbtiType.add("istj");
		mbtiType.add("estj");
		mbtiType.add("istj");
		mbtiType.add("istp");
		mbtiType.add("enfj");
		mbtiType.add("entj");
		mbtiType.add("enfj");
		mbtiType.add("enfj");
		mbtiType.add("enfj");
		mbtiType.add("enfj");
		
		System.out.println(mbtiType);
		
//		문법 or iterator(interface)
//		향상된 for문
//		System.out.println(mbtiType[0]); - x
		
//		for(String mbti: mbtiType ) {
//			System.out.println(mbti);
//		};
		
		
//		순서가 없을 때 순서를 붙여주는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
			if(mbti.equals("istj")) {
				System.out.println(mbti);
				
			}
		}
		
//      중복된 데이터 삭제 
      ArrayList<Integer> datas =new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40));
     
      datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
     
      System.out.println(datas);
		
     
		
		
		
		
		
		
		

}
}