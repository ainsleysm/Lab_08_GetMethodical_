import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String M = "";
        String menu = "";

        SSN = SafeInput.getRegExString(in, "What is your social security number", "\\d{3}-\\d{2}-\\d{4}");
        M = SafeInput.getRegExString(in, "What is your M number", "(M|m)\\d{5}");
        menu = SafeInput.getRegExString(in, "What is your menu choice [O - Open, S - Save, V - View, Q - Quit]", "[OoSsVvQq]");

    }
}
