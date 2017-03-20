Package NFLDraft

import java.applet.*;
import java.awt.*;



public class PlayerManager extends Applet{

	   int squareSize = 50;   // initialized to default size

	   private void parseSquareSize (String param) {}
	   private Color parseColor (String param) {
		return null;}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void start()
	{
		
	}
	public void init()
	{
		   String squareSizeParam = getParameter ("squareSize");
		   parseSquareSize (squareSizeParam);
		   
		   String colorParam = getParameter ("color");
		   Color fg = parseColor (colorParam);
		   
		   setBackground (Color.black);
		   setForeground (fg);
	}
public void paint(Graphics g){
	
}
	
	public void stop()
	{
}

	public PlayerManager (String name, String position, String experience, int Age, int Weight, int Height, String DraftDate, String College) {
		
	nFLplayer[] P = new nFLplayer [11];
		P [0] = new nFLplayer(); 
		P [1] = new nFLplayer();
		P [2] = new nFLplayer();
		P [3] = new nFLplayer();
	    P [4] = new nFLplayer();
		P [5] = new nFLplayer();
		P [6] = new nFLplayer();
		P [7] = new nFLplayer();
		P [8] = new nFLplayer();
		P [9] = new nFLplayer();
		P [10] = new nFLplayer();
		P [11] = new nFLplayer();
		
		
		OffensivePlayer[] N = new OffensivePlayer[5];
		 N [0] = new OffensivePlayer();
		 N [1] = new OffensivePlayer();
		 N [2] = new OffensivePlayer();
		 N [3] = new OffensivePlayer();
		 N [4] = new OffensivePlayer();
		 N [5] = new OffensivePlayer();
		
		 
		DefensivePlayer[] D = new DefensivePlayer [5];
		D[0] = new DefensivePlayer();
		D[1] = new DefensivePlayer();
		D[2] = new DefensivePlayer();
		D[3] = new DefensivePlayer();
		D[4] = new DefensivePlayer();
		D[5] = new DefensivePlayer();

		//All players Name, position, experience, age, weight, height, draft date, and college
	
		
//Offensive Players	
		
	P[0].Name = "Drew Brees";
	P[0].Position = "Quarterback";
	P[0].Experience = "16th Season";
	P[0].Age = 38;
	P[0].Weight = 209;
	P[0].Height = 72;
	P[0].DraftDate = "2001: 2nd Rnd, 32nd SD";
	P[0].College = "Purdue";
		
	
	P[1].Name = "Matt Ryan";
	P[1].Position = "Quarterback";
	P[1].Experience = "9th Season";
	P[1].Age = 31;
	P[1].Weight = 217;
	P[1].Height = 76;
	P[1].DraftDate = "2008: 1st Rnd, 3rd by ATL";
	P[1].College = "Boston";
	
	
	P[2].Name = "Kirk Cousins";
	P[2].Position = "Quarterback";
	P[2].Experience = "5th Season";
	P[2].Age = 28;
	P[2].Weight = 210;
	P[2].Height = 75;
	P[2].DraftDate = "2012: 4th Rnd, 102nd by WSH";
	P[2].College = "Michigan State";
	
	
	P[3].Name = "Aaron Rodgers";
	P[3].Position = "Quarterback";
	P[3].Experience = "12th Season";
	P[3].Age = 33;
	P[3].Weight = 225;
	P[3].Height = 74;
	P[3].DraftDate = "2005: 1st Rnd, 24th by GB";
	P[3].College = "California";
	
	
	P[4].Name = "Philip Rivers";
	P[4].Position = "Quarterback";
	P[4].Experience = "13th Season";
	P[4].Age = 35;
	P[4].Weight = 228;
	P[4].Height = 77;
	P[4].DraftDate = "2004: 1st Rnd, 4th by NYG";
	P[4].College = "NC State";
	
	
	P[5].Name = "Matthew Stafford";
	P[5].Position = "Quarterback";
	P[5].Experience = "8th Season";
	P[5].Age = 29;
	P[5].Weight = 226;
	P[5].Height = 75;
	P[5].DraftDate = "2009: 1st Rnd, 1st by DET";
	P[5].College = "Georgia";
	
//Defensive Players
		
	P[6].Name = "Bobby Wagner";
	P[6].Position = "Line Backer";
	P[6].Experience = "5th Season";
	P[6].Age = 26;
	P[6].Weight = 245;
	P[6].Height = 72;
	P[6].DraftDate = "2012: 2nd Rnd, 47th by SEA";
	P[6].College = "Utah State";
	
	
	P[7].Name = "Zach Brown";
	P[7].Position = "Line Backer";
	P[7].Experience = "5th Season";
	P[7].Age = 29;
	P[7].Weight = 245;
	P[7].Height = 76;
	P[7].DraftDate = "2012: 2nd Rnd, 52nd by TEN";
	P[7].College = "North Carolina";
	
	
	P[8].Name = "Christian Kirksey";
	P[8].Position = "Line Backer";
	P[8].Experience = "3rd Season";
	P[8].Age = 24;
	P[8].Weight = 235;
	P[8].Height = 74;
	P[8].DraftDate = "2014: 3rd Rnd, 71st by CLE";
	P[8].College = "Iowa";
	
	
	P[9].Name = "Sean Lee";
	P[9].Position = "Line Backer";
	P[9].Experience = "7th Season";
	P[9].Age = 30;
	P[9].Weight = 238;
	P[9].Height = 74;
	P[9].DraftDate = "2010: 2nd Rnd, 55th DAL";
	P[9].College = "Penn State";
	
	
	P[10].Name = "Kwon Alexander";
	P[10].Position = "Line Backer";
	P[10].Experience = "2nd Season";
	P[10].Age = 22;
	P[10].Weight = 227;
	P[10].Height = 73;
	P[10].DraftDate = "2015: 4th Rnd, 124th by TB";
	P[10].College = "LSU";
	
	
	P[11].Name = "Preston Brown";
	P[11].Position = "Line Backer";
	P[11].Experience = "3rd Season";
	P[11].Age = 24;
	P[11].Weight = 251;
	P[11].Height = 73;
	P[11].DraftDate = "2014: 3rd Rnd, 73rd BUF";
	P[11].College = "Louisville";
	
	
//Offensive Players	
	
N[0].Touchdowns = 471;
N[0].YrdsPerAttempt= 8;
N[0].Completions = 70;
N[0].IntThrown = 15;
N[0].PassAttempts = 673;
N[0].PassingYards = 5208;
N[0].passTchdwns = 37;
N[0].PassPlay = 98;
N[0].PassRating = 102;


N[1].Touchdowns = 373;
N[1].YrdsPerAttempt= 9;
N[1].Completions = 70;
N[1].IntThrown = 7;
N[1].PassAttempts = 534;
N[1].PassingYards = 4944;
N[1].passTchdwns = 38;
N[1].PassPlay = 76;
N[1].PassRating = 117;


N[2].Touchdowns = 406;
N[2].YrdsPerAttempt= 8;
N[2].Completions = 67;
N[2].IntThrown = 12;
N[2].PassAttempts = 606;
N[2].PassingYards = 4917;
N[2].passTchdwns = 25;
N[2].PassPlay = 80;
N[2].PassRating = 97;


N[3].Touchdowns = 401;
N[3].YrdsPerAttempt= 7;
N[3].Completions = 66;
N[3].IntThrown = 15;
N[3].PassAttempts = 65;
N[3].PassingYards = 4428;
N[3].passTchdwns = 40;
N[3].PassPlay = 66;
N[3].PassRating = 104;

N[4].Touchdowns = 349;
N[4].YrdsPerAttempt= 8;
N[4].Completions = 60;
N[4].IntThrown = 21;
N[4].PassAttempts = 578;
N[4].PassingYards = 4386;
N[4].passTchdwns = 33;
N[4].PassPlay = 59;
N[4].PassRating = 88;


N[5].Touchdowns = 388;
N[5].YrdsPerAttempt= 7;
N[5].Completions = 65;
N[5].IntThrown = 10;
N[5].PassAttempts = 594;
N[5].PassingYards = 4327;
N[5].passTchdwns = 24;
N[5].PassPlay = 73;
N[5].PassRating = 93;

//Defensive Players


D[0].AssistTckl = 82;
D[0].CombTackles= 167;
D[0].ForceFumble = 0;
D[0].IntThrown = 1;
D[0].FumbleRec = 1;
D[0].Sacks = 5;
D[0].Tackles = 85;

D[1].AssistTckl = 52;
D[1].CombTackles= 149;
D[1].ForceFumble = 2;
D[1].IntThrown = 1;
D[1].FumbleRec = 0;
D[1].Sacks = 4;
D[1].Tackles = 97;

D[2].AssistTckl = 52;
D[2].CombTackles= 148;
D[2].ForceFumble = 0;
D[2].IntThrown = 0;
D[2].FumbleRec = 0;
D[2].Sacks = 3;
D[2].Tackles = 96;

D[3].AssistTckl = 52;
D[3].CombTackles= 145;
D[3].ForceFumble = 0;
D[3].IntThrown = 0;
D[3].FumbleRec = 1;
D[3].Sacks = 0;
D[3].Tackles = 93;


D[4].AssistTckl = 37;
D[4].CombTackles= 145;
D[4].ForceFumble = 1;
D[4].IntThrown = 1;
D[4].FumbleRec = 1;
D[4].Sacks = 3;
D[4].Tackles = 108;


D[5].AssistTckl = 60;
D[5].CombTackles= 139;
D[5].ForceFumble = 1;
D[5].IntThrown = 0;
D[5].FumbleRec = 2;
D[5].Sacks = 1;
D[5].Tackles = 79;






	
System.out.println(N[0].Touchdowns + N[0].YrdsPerAttempt + N[0].Completions);
System.out.println(N[0].IntThrown + N[0].PassAttempts + N[0].PassingYards);
System.out.println(N[0].passTchdwns + N[0].PassPlay + N[0].PassRating);
System.out.println(P[0].Name + P[0].Position + P[0].Age + P[0].Height + P[0].Weight);
System.out.println(P[0].DraftDate + P[0].College);
	
	
System.out.println(N[1].Touchdowns + N[1].YrdsPerAttempt + N[1].Completions);
System.out.println(N[1].IntThrown + N[1].PassAttempts + N[1].PassingYards);
System.out.println(N[1].passTchdwns + N[1].PassPlay + N[1].PassRating);
System.out.println(P[1].Name + P[1].Position + P[1].Age + P[1].Height + P[1].Weight);
System.out.println(P[1].DraftDate + P[1].College);	
	
	
System.out.println(N[2].Touchdowns + N[2].YrdsPerAttempt + N[2].Completions);
System.out.println(N[2].IntThrown + N[2].PassAttempts + N[2].PassingYards);
System.out.println(N[2].passTchdwns + N[2].PassPlay + N[2].PassRating);
System.out.println(P[2].Name + P[2].Position + P[2].Age + P[2].Height + P[2].Weight);
System.out.println(P[2].DraftDate + P[2].College);	
	
	
System.out.println(N[3].Touchdowns + N[3].YrdsPerAttempt + N[3].Completions);
System.out.println(N[3].IntThrown + N[3].PassAttempts + N[3].PassingYards);
System.out.println(N[3].passTchdwns + N[3].PassPlay + N[3].PassRating);
System.out.println(P[3].Name + P[3].Position + P[3].Age + P[3].Height + P[3].Weight);
System.out.println(P[3].DraftDate + P[3].College);	
	

System.out.println(N[4].Touchdowns + N[4].YrdsPerAttempt + N[4].Completions);
System.out.println(N[4].IntThrown + N[4].PassAttempts + N[4].PassingYards);
System.out.println(N[4].passTchdwns + N[4].PassPlay + N[4].PassRating);
System.out.println(P[4].Name + P[4].Position + P[4].Age + P[4].Height + P[4].Weight);
System.out.println(P[4].DraftDate + P[4].College);


System.out.println(N[5].Touchdowns + N[5].YrdsPerAttempt + N[5].Completions);
System.out.println(N[5].IntThrown + N[5].PassAttempts + N[05].PassingYards);
System.out.println(N[5].passTchdwns + N[5].PassPlay + N[5].PassRating);
System.out.println(P[5].Name + P[5].Position + P[5].Age + P[5].Height + P[5].Weight);
System.out.println(P[5].DraftDate + P[5].College);

//Defensive Player Print Outs

System.out.println(D[0].AssistTckl + D[0].CombTackles + D[0].ForceFumble);
System.out.println(D[0].IntThrown + D[0].FumbleRec + D[0].Sacks + D[0].Tackles);
System.out.println(P[6].Name + P[6].Position + P[6].Age + P[6].Height + P[6].Weight);
System.out.println(P[6].DraftDate + P[6].College);


System.out.println(D[1].AssistTckl + D[1].CombTackles + D[1].ForceFumble);
System.out.println(D[1].IntThrown + D[1].FumbleRec + D[1].Sacks + D[1].Tackles);
System.out.println(P[7].Name + P[7].Position + P[7].Age + P[7].Height + P[7].Weight);
System.out.println(P[7].DraftDate + P[7].College);


System.out.println(D[2].AssistTckl + D[2].CombTackles + D[2].ForceFumble);
System.out.println(D[2].IntThrown + D[2].FumbleRec + D[2].Sacks + D[2].Tackles);
System.out.println(P[8].Name + P[8].Position + P[8].Age + P[8].Height + P[8].Weight);
System.out.println(P[8].DraftDate + P[8].College);


System.out.println(D[3].AssistTckl + D[3].CombTackles + D[3].ForceFumble);
System.out.println(D[3].IntThrown + D[3].FumbleRec + D[3].Sacks + D[3].Tackles);
System.out.println(P[9].Name + P[9].Position + P[9].Age + P[9].Height + P[9].Weight);
System.out.println(P[9].DraftDate + P[9].College);


System.out.println(D[4].AssistTckl + D[4].CombTackles + D[4].ForceFumble);
System.out.println(D[4].IntThrown + D[4].FumbleRec + D[4].Sacks + D[4].Tackles);
System.out.println(P[10].Name + P[10].Position + P[10].Age + P[10].Height + P[10].Weight);
System.out.println(P[10].DraftDate + P[10].College);


System.out.println(D[5].AssistTckl + D[5].CombTackles + D[5].ForceFumble);
System.out.println(D[5].IntThrown + D[5].FumbleRec + D[5].Sacks + D[5].Tackles);
System.out.println(P[11].Name + P[11].Position + P[11].Age + P[11].Height + P[11].Weight);
System.out.println(P[11].DraftDate + P[11].College);

	}
	
	}

	
