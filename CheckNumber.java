import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = checkNumber(number);

        if (result) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }

        sc.close();
    }
	
    // Method to check if a number is a power of two
    public static boolean checkNumber(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
