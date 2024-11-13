package 약수_배수와소수;

import java.io.*;
import java.util.ArrayList;

public class _11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
        }

        if (N > 1) {
            bw.write(N + "\n");
        }
//        boolean[] isPrime = new boolean[N + 1];
//
//        ArrayList<Integer> primes = new ArrayList();
//
//        for (int i = 2; i <= N; i++) {
//            isPrime[i] = true;
//        }
//
//        for (int i = 2; i * i <= N; i++) {
//            if (isPrime[i]) {
//                primes.add(i);
//                for (int j = i * i; j <= N; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//
//        for (int prime : primes) {
//            while (N % prime == 0) {
//                bw.write(prime + "\n");
//                N /= prime;
//            }
//        }
//
//        if (N > 1) {
//            bw.write(N + "\n");
//        }

        bw.flush();
        bw.close();
        br.close();
    }
}
