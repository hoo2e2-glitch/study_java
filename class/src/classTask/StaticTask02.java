package classTask;

//학생(Student)
//이름, 학번, 국어점수, 영어점수, 수학점수
//학생들은 총점과 평균을 출력해주는 메서드를 가지고 있습니다.
//또한 학생들의 총 숫자를 출력할 수 있습니다.
//필요시 필드는 추가로 구현할 수 있습니다.

class Student{
	static int studentNum;
	String name;
	int id;
	int korPoint;
	int engPoint;
	int mathPoint;
	int total;
	int aver;
	int point;
	
//	   Long data1; // 0L
//	   float data2; // 0.0F
//	   boolean data3; // false
//	   
//	//   클래스의 초기값 null
//	//   Student st; // null
	
	// 기본
	public Student() {;}

	// 초기화
	public Student(String name, int id, int korPoint, int engPoint, int mathPoint) {
		this.name = name;
		this.id = id;
		this.korPoint = korPoint;
		this.engPoint = engPoint;
		this.mathPoint = mathPoint;
		this.total = korPoint + engPoint + mathPoint;
		this.aver = total / 3;
	}
	
//  스태틱 블럭
static {
  System.out.println("시험을 응원합니다!");
}

//  초기화 블럭
{
  this.point = 5000;
  studentNum++;
}
	
	
}


public class StaticTask02 {
	public static void main(String[] args) {
		
//학생 3명을 객체화 하고
		Student st1 = new Student("학생1", 1111, 50, 50, 50);
		Student st2 = new Student("학생2", 2222, 60, 40, 80);
		Student st3 = new Student("학생3", 3333, 80, 10, 20);
		
//각각 학생의 총점과 평균을 출력
		System.out.println(st1.korPoint + st1.engPoint + st1.mathPoint);
		System.out.println(st2.korPoint + st2.engPoint + st2.mathPoint);
		System.out.println(st3.korPoint + st3.engPoint + st3.mathPoint);
		System.out.println((st3.korPoint + st3.engPoint + st3.mathPoint) / 3);
//학생의 총 수를 출력 
		Student.studentNum += 20;
		System.out.println(Student.studentNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
