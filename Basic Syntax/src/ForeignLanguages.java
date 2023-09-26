import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        switch (country) {
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            case "England":
            case "USA":
                System.out.println("English");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
