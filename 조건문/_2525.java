package 조건문;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int t = scanner.nextInt();
        int a = (M + t) / 60;
        int b = (M + t) % 60;
        if (a >= 1) {
            M = b;
            H = H + a;
            if (H >= 24) {
                H = H - 24;
            }
        }
        if (a < 1) {
            M = b;
        }
        System.out.println(H + " " + M);
    }
}
