import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double degrees = Double.parseDouble(scanner.nextLine());

        System.out.println("Today in " + city + " it is " + degrees + " degrees");
    }
}
