# hello-world
GCU student assignments
public class Exercise_1.4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a      a^2    a^3");
		System.out.println("1      1      1");
		System.out.println("2      4      8");
		System.out.println("3      9      27");
	}

}

public class Exercise_1.7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 ));
		System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 ));
	}

}

public class Exercise_1.8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( 2 * 5.5 * Math.PI);
		System.out.println( 5.5 * 5.5 * Math.PI);
	}

}


public class Exercise_1.10 {

			public static void main(String[] strings) {

		        double kilometers = 14.0;
		        double miles = kilometers / 1.6;

		        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
		        double milesPerHour = miles / rate;

		        System.out.println(milesPerHour);


		    }

		{
	}

}


public class Exercise_11 {

    public static void main(String[] strings) {

        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;



        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);

        }


    }
}


public class Exercise_13 {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = " + x + " y = " + y);

    }
}
