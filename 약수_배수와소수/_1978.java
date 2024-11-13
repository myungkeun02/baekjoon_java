package 약수_배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (isPrime(n)) {
                result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
