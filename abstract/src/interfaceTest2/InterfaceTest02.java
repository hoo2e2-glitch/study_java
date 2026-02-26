package interfaceTest2;

import java.security.DomainCombiner;

// 동물

// 마커인터페이스
// 육식동물, 초식동물
// Lion, Bear, Deer, Rabbit

public class InterfaceTest02 {
	public void checkAnimal(Animal animal) {

		if(animal instanceof HerbivroeMark) {		
			// 초식
			// 다운
			this.feedHa((HerbivroeMark)animal);
			
		}else if(animal instanceof CarnivoreMark) {
			// 육식
			// 다운
			this.feedCa((CarnivoreMark)animal);
			}
		}
	
	// 업
	public void feedCa(CarnivoreMark carnivoreMark ) {
		System.out.println("먹이던짐");
	}
	
	public void feedHa(HerbivroeMark herbivroeMark ) {
		System.out.println("채소던짐");
		
	}
	
		public static void main(String[] args) {
			InterfaceTest02 la = new InterfaceTest02();
			
			Bear bear = new Bear();
			Deer deer = new Deer();
			
			la.checkAnimal(deer);
			la.checkAnimal(bear);
			
			
			
		}
		
		
		
	}
		
	
	
	

}
