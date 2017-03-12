package NFLplayer;

import nfldraft.Celebrator;

public abstract class nFLPlayer implements Celebrator {

private String name;
private String position;
private int age;
private int height;
private int weight;
private String experience;
private String college;

public nFLPlayer (String name, String position, int age, int height, int weight, String experience, String college) {
	this.name = name;
	this.position = position;
	this.age = age;
	this.height = height;
	this.weight = weight;
	this.experience = experience;
	this.college = college;
}

public String getName() {
   return name;
}

public String getPos() {
   return position;
}

public int getAge() {
	   return age;
	}

public int getHT() {
	   return height;
	}

public int getWT() {
	   return weight;
	}

public String getXP() {
	   return experience;
	}


public String getColl() {
	   return college;
	}





public void setName(String newName) {
   name = newName;
}

public void setPos( String newPosition) {
   position = newPosition;
}

public void setAge( int newAge) {
	   age = newAge;
}
	   public void setHT( int newHT) {
		   height = newHT;
	   }
		   public void setWT( int newWT) {
			   weight = newWT;
		   }
			   public void setXP( String newXP) {
				   experience = newXP;
			   }	   
				   public void setColl( String newCollege) {
					   college = newCollege;
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
