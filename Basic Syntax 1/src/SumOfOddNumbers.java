import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int oddNum = 1;

        for (int i = 0; i < n; i++) {

            sum += oddNum;
            System.out.println(oddNum);
            oddNum += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
