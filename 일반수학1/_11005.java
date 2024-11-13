package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class _11005 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (N == 0) {
            sb.append("0");
        } else {
            int number = N;
            while (number > 0) {
                int remainder = number % B;
                if (remainder >= 10) {
                    sb.append((char) ('A' + (remainder - 10)));
                } else {
                    sb.append(remainder);
                }
                number /= B;
            }
            sb.reverse();
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
