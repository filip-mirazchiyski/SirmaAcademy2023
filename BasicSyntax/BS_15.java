import java.util.Scanner;

public class BS_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double weight = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());
        Double heightSquared = height * height;

        Double BMI = weight / heightSquared;

        System.out.printf("%.2f", BMI);
    }
}
