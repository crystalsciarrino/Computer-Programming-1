package NFLplayer;

public class DefensivePlayer extends nFLPlayer {

	 private int Tackles;
	 private int AS_Tackles;
	 private int Sacks;

	 	public String getName() {
	 		System.out.println("Player's name : "  + getName());
	 		return " Keanu Neal ";
	 	}
	 	public String getPos() {
	 		System.out.println(" Player's position : "  + getPos());
	 		return " Safety ";
	 	}
	 	 	public int getAge() {
	 	 		System.out.println("Player's Age:"  + getAge());
	 	 		return 21;
	 	 	}
	 	 		public int getHT() {
	 	 	 		System.out.println("Player's Height : "  + getHT() + " inches");
	 	 	 		return 72 ;
	 	 	 	}
	 	 		
	 	 		public int getWT() {
	 	 	 		System.out.println("Player's Weight : "  + getWT() + " Pounds ");
	 	 	 		return 211;
	 	 	 	}
	 	 		
	 	 		public String getXP() {
	 	 	 		System.out.println("Player's Experience Level:"  + getXP());
	 	 	 		return " Rookie ";
	 	 	 	}
	 	 		
	 	 		public String getColl() {
	 	 	 		System.out.println("Player's College : "  + getColl());
	 	 	 		return "Florida ";
	 	 	 	}
	 
	 public DefensivePlayer (String name, String position, int age, int height, int weight, String experience, String college) {
	     super(name, position, age, height, weight, experience, college);
	     }
	 		
	 
	 public int getTackles () {
		 return Tackles;

		 }
	 public void setTackles( int newTackles) {
		   Tackles = newTackles;	   	   
	 	}

		public int getAS_Tackles() {
			return AS_Tackles;
		}

		public int getSacks() {
		   return Sacks;
		}

		public void setAS_Tackles( int newAS_Tackles) {
		   AS_Tackles = newAS_Tackles;
		}

		public void setSacks( int newSacks) {
			Sacks = newSacks;
		}
	}	

