package formatTask02;

public class FormatTask02 {
	public static void main(String[] args) {
		
//      %자릿수d
//      %5d
      
//      국어점수, 영어점수, 수학점수를 받아서 서식에 맞게 출력
//      이름: 이규학
//      수학:    20점
//      국어:    40점
//      영어:    15점
//      총점:    75점
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		String name = "";
		
		num1 = 20;
		num2 = 40;
		num3 = 15;
		num4 = 75;
		name = "이규학";
		
		String result = "이름: %5s\n수학: %5d점\n국어: %5d점\n영어: %5d점\n총점: %5d점";
		
		// System.out.printf("이름: %5s\n", name);
		// System.out.printf("수학: %5d점\n", num1);
		// System.out.printf("국어: %5d점\n", num2);
		// System.out.printf("영어: %5d점\n", num3);
		// System.out.printf("총점: %5d점", num4);
		System.out.printf(result, name, num1, num2, num3, num4);
		
		
// 모두 변수에 담아서 		
//     국어점수, 영어점수, 수학점수를 받아서 서식에 맞게 출력
//      int mathScore = 0, korScore = 0, engScore = 0, totalScore = 0;
//      String name = "",
//            kor = "국어:", 
//            eng = "영어:", 
//            math = "수학:", 
//            score = "%6d점\n",
//            total = "총점:",
//            nameResult = "이름: %5s\n",
//            korResult = kor + score,
//            engResult = eng + score,
//            mathResult = math + score,
//            totalResult = total + score,
//            result = nameResult + mathResult + korResult + engResult + totalResult;
//      
//      name = "이규학";
//      mathScore = 20;
//      korScore = 15;
//      engScore = 10;
//      totalScore = mathScore + korScore + engScore;
//      
//      System.out.printf(result, name, mathScore, korScore, engScore, totalScore);
		
	}

}
