package CH_13
import tools.Calendar
import java.Calendar

public class CH13_13_4 {

    private static MyCalendar calendar;
    public static void main(String[] args) {
        if (args.length > 2 || args.length == 0) {
            System.out.println("Invalid arguments");
            System.out.println("Usage: java Exercise13_04 5 2016");
            System.exit(1);
        }

        int year;
        if (args.length == 1) {
            year = Calendar.getInstance().get(Calendar.YEAR);
        } else {
            year = new Integer(args[1]);
        }
        int month = Integer.parseInt(args[0]) - 1;
        calendar = new MyCalendar(year, month, 1);
        calendar.set(Calendar.DATE, 1);

        printMonth();
    }
    public static void printMonth() {
        printMonthTitle();
        printMonthBody();
    }
    public static void printMonthTitle() {
        System.out.println("         " + calendar.getMonthName()
                + " " + calendar.get(Calendar.YEAR));
        System.out.println("------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody() {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDaysInMonth = calendar.daysInMonth();
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
}
