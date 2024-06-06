package 입출력과사칙연산;

import java.util.ArrayList;
import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = A * B;
        ArrayList<Integer> arrNumB = new ArrayList<>();
        while(B > 0) {
            arrNumB.add(B %10);
            B /= 10;
        }
        System.out.println(arrNumB.get(0) * A);
        System.out.println(arrNumB.get(1) * A);
        System.out.println(arrNumB.get(2) * A);
        System.out.println(C);
    }
}
