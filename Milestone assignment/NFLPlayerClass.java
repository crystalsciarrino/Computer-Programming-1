package NFLplayer;

import nfldraft.Celebrator;

public abstract class nFLPlayer implements Celebrator {


public class nFLplayer{

	public static void main(String[] args){
	}
	public String Name;
	public String Position;
	public String Experience;
	public int Age;
	public int Weight;
	public int Height;
	public String DraftDate;
	public String College;

	
public nFLplayer (String name, String position, int age, int height, int weight, String experience, String college) {
	this.Name = name;
	this.Position = position;
	this.Age = age;
	this.Height = height;
	this.Weight = weight;
	this.Experience = experience;
	this.College = college;
}

public nFLplayer() {
	// TODO Auto-generated constructor stub
}

public String getName() {
   return Name;
}

public String getPos() {
   return Position;
}

public int getAge() {
	   return Age;
	}

public int getHT() {
	   return Height;
	}

public int getWT() {
	   return Weight;
	}

public String getXP() {
	   return Experience;
	}


public String getColl() {
	   return College;
	}


public void setName(String newName) {
   Name = newName;
}

public void setPos( String newPosition) {
   Position = newPosition;
}

public void setAge( int newAge) {
	   Age = newAge;
}
	   public void setHT( int newHT) {
		   Height = newHT;
	   }
		   public void setWT( int newWT) {
			   Weight = newWT;
		   }
			   public void setXP( String newXP) {
				   Experience = newXP;
			   }	   
				   public void setColl( String newCollege) {
					   College = newCollege;
				   }
}


				public String Dance() {
					// TODO Auto-generated method stub
					return null;
				}

				public String Fist() {
					// TODO Auto-generated method stub
					return null;
				}

				public String Point() {
					// TODO Auto-generated method stub
					return null;
				}

				public String Clap() {
					// TODO Auto-generated method stub
					return null;
				}

				public String Pump() {
					// TODO Auto-generated method stub
					return null;
				}





}
