import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
    while(num % 2 != 0){
        System.out.println("Please write an even number.");
        num = Math.abs(Integer.parseInt(scanner.nextLine()));
    }
        System.out.println("The number is: " + num);

    }
}
