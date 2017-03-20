Package NFLDraft

public class OffensivePlayer extends nFLplayer {

//Variables determined for Offensive players throughout code. 

	int Touchdowns;
	
	int PassingYards;
	
	int PassAttempts;
	
	int Completions;
	
	int YrdsPerAttempt;
	
	int PassPlay;
	
	int passTchdwns;
	
	int IntThrown;
	
	int PassRating;


	 public OffensivePlayer (String name, String position, int age, int height, int weight, String experience, String college) {
	     super(name, position, age, height, weight, experience, college);
	     }
	 		
	 
	 public OffensivePlayer() {
		// TODO Auto-generated constructor stub
	}


	public int getTouchdowns () {
		 return Touchdowns;

		 }
	 public void setTouchdowns( int newTouchdowns) {
		   Touchdowns = newTouchdowns;	   	   
	 	}
	 
	 public int getYards() {
			return PassingYards;
		}

		public int getpCOMP() {
			return Completions;
		}

		public int getaTT_Comp() {
		   return PassAttempts;
		}

		public void setYards( int newYards) {
			PassingYards = newYards;
		}

		public void setpComp( int newpComp) {
		   Completions = newpComp;
		}

		public void setaTT_Comp( int newaTT_Comp) {
	   PassAttempts = newaTT_Comp;		
	
	}
}
}

//Inheritance from Celebrator Interface via nflplayer

	@Override
	public void celebrate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String Dance() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Fist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Point() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Clap() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Pump() {
		// TODO Auto-generated method stub
		return null;
	}
}	


