import java.util.Scanner;

public class BS_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int D = Integer.parseInt(scanner.nextLine());
        int T = Integer.parseInt(scanner.nextLine());

        float avSpeed = D / T;

        System.out.printf("%.2f", avSpeed);
    }
}
