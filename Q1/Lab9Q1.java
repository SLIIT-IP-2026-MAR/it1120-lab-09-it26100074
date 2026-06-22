import java.util.Scanner;

public class IT26100074Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double determinant = Math.pow(b, 2) - (4 * a * c);

        System.out.println();
        System.out.println("Roots are real and different : ");

        double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        double root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        System.out.println("Root 1: " + String.format("%.2f", root1));
        System.out.println("Root 2: " + String.format("%.2f", root2));
    }
}