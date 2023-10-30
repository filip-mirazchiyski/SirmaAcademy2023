import java.util.Scanner;

public class BS_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int unitsConsumed = Integer.parseInt(scanner.nextLine());
        double ratePerUnit = Double.parseDouble(scanner.nextLine());
        Double totalBill = (unitsConsumed * ratePerUnit) + 10.0;

        System.out.printf("%.2f", totalBill);
    }
}
