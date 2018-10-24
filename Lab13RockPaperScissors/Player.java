package Lab13RockPaperScissors;

public abstract class Player {

	
		private String name;
		
		public Player() {}
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private String roshamboValue;
		
		public abstract Roshambo generateRoshambo();


		public String getRoshamboValue() {
			return roshamboValue;
		}


		public void setRoshamboValue(String roshamboValue) {
			this.roshamboValue = roshamboValue;
		}
		
		
		
	}
	
	

