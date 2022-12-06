import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favInt = 0;
        double favD = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "What is your fav integer");
        favD = SafeInput.getDouble(in, "What is your fav double");

        System.out.println("You said your fav integer is: " + favInt);
        System.out.println("You said your fav double is: " + favD);
    }
}
