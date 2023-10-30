import java.util.Scanner;

public class BS_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double R = Double.parseDouble(scanner.nextLine());

        Double circumference = 2 * R * Math.PI;

        System.out.printf("%.2f", circumference);
    }
}
