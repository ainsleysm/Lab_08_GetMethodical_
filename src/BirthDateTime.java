import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int mins = 0;
        int upperDaysLimit = 0;
        Scanner in = new Scanner(System.in);

        year = SafeInput.getRangedInt(in, "What year were you born", 1950, 2010);
        month = SafeInput.getRangedInt(in, "What month were you born", 1, 12);

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                upperDaysLimit = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                upperDaysLimit = 30;
                break;
            case 2:
                upperDaysLimit = 29;
        }
        day = SafeInput.getRangedInt(in, "What day were you born", 1, upperDaysLimit);
        hours = SafeInput.getRangedInt(in, "What hour were you born", 1, 24);
        mins = SafeInput.getRangedInt(in, "What minute were you born", 1, 59);

        System.out.println("You said you were born year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("hour: " + hours);
        System.out.println("minute: " + mins);

    }
}
