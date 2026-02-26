package clasTask03;

public class Animals {
		
		private String name;
		private String type;
		
		public Animals() {;}
		
		public Animals(String name, String type) {
			super();
			this.name = name;
			this.type = type;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public void separation() {
			System.out.println("동물종류분리");
			
		}

	

}
