import java.util.Scanner;

public class BS_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        int timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(timeSeconds);
        double mps = 1.0 * distance / timeSeconds;
        System.out.printf("%.6f", mps);
    }
}
