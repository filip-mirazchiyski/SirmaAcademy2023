import java.util.Scanner;

public class BS_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double red = n / 13.0;
        double yellow = red * 4.0;
        double white = red * 8.0;
        System.out.printf("Red: %.4f \n" , red);
        System.out.printf("Yellow: %.4f \n", yellow);
        System.out.printf("White: %.4f \n", white);

    }
}


