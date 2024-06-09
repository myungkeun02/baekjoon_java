package 반복문;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt()/4;
        StringBuilder result = new StringBuilder();
        String[] list = {"int"};
        for (int i = 0; i < N; i++) {
            result.append("long ");
        }
        System.out.println(result+"int");
    }
}
