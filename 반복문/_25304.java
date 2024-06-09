package 반복문;

import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int totalCount = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < totalCount; i++) {
            int price = scanner.nextInt();
            int counts = scanner.nextInt();
            sum += price * counts;
        }

        scanner.close();

        if (sum != totalPrice) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

