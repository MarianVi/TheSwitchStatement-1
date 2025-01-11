import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        String firstLetter = scanner.nextLine();

        switch (firstLetter) {
            case "d":
                System.out.println("delta");
                break;
            case "e":
                System.out.println("echo");
                break;
            case "v":
                System.out.println("victor");
                break;
            case "s":
                System.out.println("sierra");
                break;
            default:
                System.out.println("Litera invalida!");
        }

        scanner.close();
    }
}