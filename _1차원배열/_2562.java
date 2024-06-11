package _1차원배열;

import java.io.*;

public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[9];

        for (int i = 0; i < 9; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }

        int max = ints[0];
        int maxIndex = 0;

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1); // 1-based index
    }
}
