package classTest;


//	동물
//  이름(name), 나이(age), 종류(species)
//	추상화
class Animal {
	String name;
	int age;
	String species;
	
//	1.기본 생성자 - 먼저만들기
	public Animal() {;}
	
//	2.초기화 생성자
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
} 

// 토끼, 강아지, 고양이
public class ClassTest {
	
	public static void main(String[] args) {
//		메모리에 할당 > new
//		생성자 - 앞글자 대문자
//		rabbit -> 객체
		Animal rabbit = new Animal("토깽이", 20, "토끼");
		Animal cat = new Animal("치즈", 3, "고양이");
		
//		rabbit.name = "토깽이";
//		rabbit.age = 20;
//		rabbit.species = "토끼";
		
		
		
	}
	
	
	

}
