package 조건문;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45) {
            M += 60 - 45; // M = M + 15
            H -= 1;
            if (H < 0) {
                H = 23;
            }
        } else {
            M -= 45;
        }
        System.out.println(H + " " + M);
    }
}
