import java.util.Scanner;

public class BS_6 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String text = user_input.nextLine();
        char symbol = user_input.nextLine().charAt(0);
        int integer = Integer.parseInt(user_input.nextLine());
        double realNumber = Double.parseDouble(user_input.nextLine());
        System.out.println(text);
        System.out.println(symbol);
        System.out.println(integer);
        System.out.println(realNumber);
        System.out.print(text);
        System.out.print(symbol);
        System.out.print(integer);
        System.out.print(realNumber);
    }
}
