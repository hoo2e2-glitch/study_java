package practice;

class Point{
	private int[] scores = null;
	
	public Point() {;}

	public Point(int[] scores) {
		this.scores = scores;
	}
	
//1. 60점 이상인 점수만 골라서 전부 더하기
	public int addPoint(int[] scores) {
		int add = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				add += scores[i];
			} 
		}
		return add;
	}
	
//2. 60점 이상인 점수의 개수 구하기
	public int getPoint(int[] scores) {
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				count++;
			}
		}
		return count;
	}
	
//3. 60점 이상인 점수들의 평균 구하기 (소수점 둘째자리까지)
	public double averPoint(int[] scores) {
		double add = 0;
		double count = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				add += scores[i];
				count++;
			}
		}
		return Math.round(add / count * 100) / 100.0;
		// return Double.parseDouble(String.format("%.2f", aver));
	}
	
}

//
//int[] scores = {45, 82, 91, 60, 73, 55, 88, 40, 95, 67};
//위 배열을 이용해서 아래를 출력하시오.
//
//조건:
//
//예상 출력값:
//합계: 556
//개수: 7명
//평균: 79.43

public class Task06 {
	public static void main(String[] args) {
		Point po = new Point();
		
		int[] scores = {45, 82, 91, 60, 73, 55, 88, 40, 95, 67};
		
		System.out.println("합계: " + po.addPoint(scores));
		System.out.println("개수: " + po.getPoint(scores) + "명");
		System.out.println("평균: " + po.averPoint(scores));
		
		
	}

}
