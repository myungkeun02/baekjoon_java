package 조건문;

import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(a * 1000 + 10000);
        } else if (a == b) {
            System.out.println(a * 100 + 1000);
        } else if (a == c) {
            System.out.println(a * 100 + 1000);
        } else if (c == b) {
            System.out.println(c * 100 + 1000);
        } else {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
