package methodTask;

public class MethodTask02 {
//  1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
	
	 String checkChar(char ch) {
			String result = "";
			
			if(ch >= 65 && ch <= 90) {
				result = "대문자"; // 65 - 90
			}else if (ch >= 97 && ch <= 122) {
				result = "소문자"; // 97- 122
				// 소문자
			}else {
				//'일반문자'
				result = "일반문자";
			}
				return result;
		};
	
	
//  2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
	int[]calc(int num1, int num2) {
		int[] result = new int[4];
		
		result[0] = num1 + num2;
		result[1] = num1 - num2;
		result[2] = num1 / num2;
		result[3] = num1 * num2;
		return result;
	}
	
	
//  3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
	int[] getMinAndMax(int[] datas) {
		int[] result = new int[2];
		
		int min = datas[0], max = datas[0];
		
		for(int data: datas) {
			if(min > data) {min = data;};
			if(max < data) {max = data;};
		}
	
		result[0] = min;
		result[1] = max;
		return result;
	}
	
	
public static void main(String[] args) {
	
	MethodTask02 mt02 = new MethodTask02();
	
	
//  1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
  System.out.println(mt02.checkChar('A'));

//2. 두 정수를 받아서 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
	int[] result2 = mt02.calc(10, 20);
	for(int result : result2) {
		System.out.println(result);
	}

//3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
	int[] datas = {10, 20, 30, 40, 50};
	int[] result3 = mt02.getMinAndMax(datas);
	for(int result: result3) {
		System.out.println(result);
		}
	}
}

