package classTask;

//학생(Student)
//이름, 학번, 국어점수, 영어점수, 수학점수
//학생들은 총점과 평균을 출력해주는 메서드를 가지고 있습니다.
//또한 학생들의 총 숫자를 출력할 수 있습니다.
//필요시 필드는 추가로 구현할 수 있습니다.

class Student {
	static int count; // 0
	String name; // null
	int number; // 0
	int kor;
	int eng;
	int math;
	int total;
	double average; // 0.0
	int point;
	Long data1; // 0L
	float data2; // 0.0F
	boolean data3; // false
	
//	클래스의 초기값 null
//	Student st; // null
	
	// 기본
	public Student() {;}

	// 초기화
	public Student(String name, int number, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = Double.parseDouble(String.format("%.2f", total / 3.0));
	}
	
//  스태틱 블럭
static {
  System.out.println("시험을 응원합니다!");
}

//  초기화 블럭
{
  this.point = 5000;
  count++;
}

void introduce() {
	System.out.printf("%s님의 점수\n총 점: %d점\n평 균: %.2f점\n", this.name, this.total, this.average);
}

void printTotalStudent() {
	System.out.println("총 학생 수: " + count + "명");
}
	
	
}


public class StaticTask02 {
	public static void main(String[] args) {
		
//학생 3명을 객체화 하고
		Student st1 = new Student("학생1", 1111, 50, 50, 50);
		Student st2 = new Student("학생2", 2222, 60, 40, 80);
		Student st3 = new Student("학생3", 3333, 80, 10, 20);
		Student st4 = new Student();
		
		
//각각 학생의 총점과 평균을 출력
		st1.introduce();
		st2.introduce();
		st3.introduce();
//학생의 총 수를 출력 
		st4.printTotalStudent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
