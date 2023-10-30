import java.util.Scanner;

public class BS_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        Double dailyConsumptionPP = water / 7.0 / people;

        System.out.printf("%.2f", dailyConsumptionPP);
    }
}
