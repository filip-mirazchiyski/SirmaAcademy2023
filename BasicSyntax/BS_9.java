import java.util.Scanner;

public class BS_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        Double median = ((numOne + numTwo) / 2.0);
        System.out.println("The sum is: " + (numOne + numTwo));
        System.out.println("The difference is: " + (numOne - numTwo));
        System.out.println("The product is: " + (numOne * numTwo));
        System.out.printf("The average is: %.1f", median);

    }
}
