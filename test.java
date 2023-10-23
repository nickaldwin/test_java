import java.util.Scanner;

public class test{

    public static void main(String args[]){

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int n2 = scanner.nextInt();

        System.out.println(" Here's your result: ");

        int ans1 = n1 + n2;
        int ans2 = n1 - n2;
        int ans3 = n1 * n2;
        int ans4 = n1 / n2;
        int ans5 = n1 % n2;

        System.out.print("Addition: " + ans1);
        System.out.print("Subtraction: " + ans2);
        System.out.print("Multiplication: " + ans3);
        System.out.print("Division: " + ans4);
        System.out.print("Modulo: " + ans5);
            
        scanner.close();

    }

}