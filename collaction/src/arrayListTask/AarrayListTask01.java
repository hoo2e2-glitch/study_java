package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class AarrayListTask01 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10; i ++) {
			datas.add((i + 1) * 10);
		}
		
		System.out.println(datas);
		
		Collections.shuffle(datas);
		
//		실습
//		50뒤에 500을 삽입
//		if(datas.contains(50)) {
//			datas.add(datas.indexOf(50) + 1, 500);
//		}
		
//		80 삭제
//		1. 인덱스로 삭제하기
//		if(datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
//		}
		
//		60 삭제
//		2. 값으로 삭제하기
		try {
			if(datas.contains(60)) {
//			Wrapper Class
//			datas.remove(Integer.valueOf(60));
				datas.remove(60);
			}
			
			System.out.println(datas);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}