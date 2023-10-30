import java.util.Scanner;

public class BS_5 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String text = user_input.nextLine();
        char symbol = user_input.nextLine().charAt(0);
        int integer = Integer.parseInt(user_input.nextLine());
        double realNumber = Double.parseDouble(user_input.nextLine());
    }
}
