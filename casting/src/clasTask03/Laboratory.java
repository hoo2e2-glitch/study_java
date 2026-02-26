package clasTask03;

// 연구소
public class Laboratory {
	
	public void comein() {
		System.out.println("동물연구실");
	}
	
	public void checkAnimal(Animals animals) {
		
		animals.separation();
		
		if(animals instanceof Harbivore) {
			Harbivore har = (Harbivore)animals;
			har.koala();
			har.deer();
			
		}else if(animals instanceof Carnivore) {
			Carnivore carn = (Carnivore)animals;
			carn.lion();
			carn.bear();
		
		}else if(animals instanceof Omivore) {
			Omivore omi = (Omivore)animals;
			omi.dog();
			omi.cat();
		}
		
		
	}

}
