Package NFLDraft

//Variables defined for all Defensive Players

public class DefensivePlayer extends nFLplayer {

	int CombTackles;
	
	int Tackles;
	
	int AssistTckl;
	
	int Sacks;
	
	int ForceFumble;
	
	int FumbleRec;
	
	int IntThrown;
	

public DefensivePlayer (String name, String position, int age, int height, int weight, String experience, String college) {
super(name, position, age, height, weight, experience, college);
}


public DefensivePlayer() {
	// TODO Auto-generated constructor stub
}


public int getTackles () {
return Tackles;

}
public void setTackles( int newTackles) {
Tackles = newTackles;	   	   
}

public int getAS_Tackles() {
return AssistTckl;
}

public int getSacks() {
return Sacks;
}

public void setAS_Tackles( int newAS_Tackles) {
AssistTckl = newAS_Tackles;
}

public void setSacks( int newSacks) {
Sacks = newSacks;
}
}

//Inheritance from Celebrator interface via nflplayer

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
