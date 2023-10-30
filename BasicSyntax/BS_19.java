import java.util.Scanner;

public class BS_19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double D = Double.parseDouble(scanner.nextLine());
        Double F = Double.parseDouble(scanner.nextLine());

        Double fuelEfficiency = D / F;

        System.out.printf("%.2f", fuelEfficiency);
    }
}
