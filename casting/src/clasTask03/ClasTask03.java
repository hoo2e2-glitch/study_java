package clasTask03;
// 출력


//동물 연구소 클래스
//checkAnimal(){}
//각각 동물이 들어오면 어떤 동물에 속하는지 출력해주는 메서드

// 이거 다시 나누기~
//동물들이 들어오면 각각의 동물들을 분리한다.
//초식동물(Harbivore)
//- 코알라, 사슴

//육식동물(Carnivore)
//- 사자, 곰

//잡식동물(Omivore)
//- 강아지, 고양이

public class ClasTask03 {
	public static void main(String[] args) {
		
		Laboratory lap = new Laboratory();
		
		lap.comein();
		
		Animals[] animals =  {new Harbivore(), new Carnivore(), new Omivore()};
		for(Animals animal:animals) {
			lap.checkAnimal(animal);
		}

		
//		lap.checkAnimal(new Harbivore());
//		lap.checkAnimal(new Carnivore());
//		lap.checkAnimal(new Omivore());
		
	}
}
