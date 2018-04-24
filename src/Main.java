import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type the number (integer) of lines of the triangle:");
        int numberOfLines = scanner.nextInt();

        for(int i = 0; i < numberOfLines; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
