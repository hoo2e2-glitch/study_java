package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T>{
	
// <?>: 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일 지 알 수 없을 때 사용한다.
//	또한 사용자가 어떤 타입의 데이터를 넣을 지 모르기 때문에
//	객체화를 시킬 때 정해준다.
	T data;
	
	public static void main(String[] args) {
		
		ArrayList<String> datas = new ArrayList<String>();
//		datas[0] = 10; - x
		
		datas.add("가나");
		datas.add("다라");
		datas.add("마바");
		datas.add("사아");
		datas.add("한글");
		
		System.out.println(datas);
		
		datas.get(3);
		System.out.println(datas.get(3));
		
//		사아
		String prev = datas.set(3, "노");
		System.out.println(datas);
		
//		밀어줌
		String removed = datas.remove(0);
		System.out.println(removed);
		System.out.println(datas);
		
	}
	
	
	

}
