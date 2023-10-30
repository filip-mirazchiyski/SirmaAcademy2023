import java.util.Scanner;

public class BS_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        Integer t1 = 3;
        Integer t2 = 1;
        Integer d1 = t1 * x;
        Integer d2 = t2 * y;

        Integer distance = d1 - d2;
        System.out.print(distance);
    }
}
