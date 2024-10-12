package _1차원배열;

import java.io.*;
import java.util.Arrays;

public class _10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);

        int[] answer = new int[N];

        for (int i = 0; i < M; i++) {
            String[] basket = br.readLine().split(" ");
            int basketI = Integer.parseInt(basket[0]);
            int basketJ = Integer.parseInt(basket[1]);
            int basketK = Integer.parseInt(basket[2]);
            for (int j = basketI -1; j < basketJ; j++) {
                answer[j] = basketK;
            }
        }
        String result = String.join(" ", Arrays.stream(answer).mapToObj(String::valueOf).toArray(String[]::new));
        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
