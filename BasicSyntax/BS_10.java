import java.util.Scanner;

public class BS_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.next());
        int HR = minutes / 60;
        int MM = minutes % 60;
        System.out.println(HR + ":" + MM);
        System.out.printf("%02d:%02d", HR, MM);
    }
}
