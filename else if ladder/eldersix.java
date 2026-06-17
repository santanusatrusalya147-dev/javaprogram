import java.util.Scanner;
class Test {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Enter your choice (+, -, *): ");
        char ch = sc.next().charAt(0); // Read single character

        if (ch == '+') {
            System.out.println("Sum = " + (no1 + no2));
        } else if (ch == '-') {
            System.out.println("Sub = " + (no1 - no2));
        } else if (ch == '*') {
            System.out.println("Mult = " + (no1 * no2));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
