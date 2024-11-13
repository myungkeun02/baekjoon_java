package 심화1;

import java.io.*;

public class _2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(i * 2 -1));
            sb.append("\n");
        }

        for (int i = N -1; i >=1; i--) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(i * 2 -1));
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
