import java.util.Scanner;

public class MultiplicationTable2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
            int multiplier = Integer.parseInt(scanner.nextLine());
            if(multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {

                System.out.println(num + " X " + i + " = " + num * i);
            }
            } else {
                System.out.println(num + " X " + multiplier + " = " + num * multiplier);
            }
        }


}
