import java.util.Scanner;

public class BS_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        double mile = km * 0.621371192;
        System.out.println(mile);
    }
}
