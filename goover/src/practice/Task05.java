package practice;

//Student 클래스를 만드세요.

class Student{
//1. 필드: 이름(name), 국어(kor), 영어(eng), 수학(math)
	String name;
	int kor;
	int eng;
	int math;
	
	public Student() {;}

//2. 생성자: 이름, 국어, 영어, 수학을 받아서 초기화
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
//   - getTotal()   : 총점을 반환하는 메서드
	public int getTotal() {
		return kor + eng + math;
	}
	
//   - getAverage() : 평균을 반환하는 메서드 (소수점 둘째자리까지)
	public double getAverage() {
		return Math.round((kor + eng + math) / 3.0 * 100) / 100;
	}
	
//   - getGrade()   : 평균에 따라 학점을 반환하는 메서드
//        90점 이상 → "A"
//        80점 이상 → "B"
//        70점 이상 → "C"
//        60점 이상 → "D"
//        60점 미만 → "F"
	public void getGrade() {
		double aver = getAverage();
		if(aver >= 90) {
			System.out.println("학점: A");
		}
		else if(aver >= 80) {
			System.out.println("학점: B");
		}
		else if(aver >= 70) {
			System.out.println("학점: C");
		}
		else if(aver >= 60) {
			System.out.println("학점: D");
		}else {
			System.out.println("60점 미만: F");
		}
	}
}

//4. main에서 아래 학생을 객체화하고
//   총점, 평균, 학점을 출력하시오.
//
//   이름: 홍길동, 국어: 85, 영어: 90, 수학: 78
//
//예상 출력값:
//총점: 253점
//평균: 84.33점
//학점: B

public class Task05 {
	public static void main(String[] args) {
		Student hong = new Student("홍길동", 85, 90, 78);
		
		
		System.out.println("총점:" + hong.getTotal() + "점");
		System.out.println("평균:" + hong.getAverage() + "점");
		hong.getGrade();
				
	}

}
