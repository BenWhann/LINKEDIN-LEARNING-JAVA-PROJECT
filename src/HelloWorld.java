import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String studentFirstName = "Jimmy";
        String studentLastName = "Fredette";
        double gpa = 3.45;
        System.out.println(gpa);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + gpa);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + gpa);
    }
}
