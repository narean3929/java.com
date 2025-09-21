import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length (n >= 1): ");
        int n = sc.nextInt();
        System.out.print("Enter border character (press Enter to use '*'): ");
        String s = sc.nextLine();       
        String chLine = sc.nextLine();
        char c = (chLine.length() > 0) ? chLine.charAt(0) : '*';

        if (n <= 0) {
            System.out.println("n must be >= 1");
            return;
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
