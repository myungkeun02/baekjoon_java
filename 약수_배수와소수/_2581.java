package 약수_배수와소수;

import java.io.*;

public class _2581 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int minPrime = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sum += i;
                if (minPrime > i) {
                    minPrime = i;
                }
            }
        }

        if (sum > 0) {
            bw.write(sum + "\n" + minPrime + "\n");
        } else {
            bw.write("-1\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
