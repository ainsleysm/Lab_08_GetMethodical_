import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double total = 0;
        boolean yn = true;
        boolean done = false;

        do {
            price = SafeInput.getRangedDouble(in, "What is the price of your item", 0.50, 9.99);
            yn = SafeInput.getYNConfirm(in, "Do you have more items");
            total = total + price;

            if(yn == true) {
                done = false;
            } else {
                done = true;
            }

        }while(!done);

        System.out.println("Your total is: ");
        System.out.printf("%.2f%n", total);
    }
}
