import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        if (inputtedNum <= 5) {
            System.out.println("You will have a good fortune");
        } else {
            System.out.println("You will have a bad fortune");
        }

    }
}
