package 조건문;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if ((y%4 == 0 && y%100 != 0) || y%400 == 0) {
           System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
