import java.util.Scanner;

public class BS_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double ABC = n * 3.87;
        System.out.printf("%.2f" , ABC);
    }
}
