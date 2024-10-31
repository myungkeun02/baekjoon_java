package 문자와문자열;

import java.io.*;

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int R = Integer.parseInt(s.split(" ")[0]);
            String S = s.split(" ")[1];
            StringBuilder sb = new StringBuilder();

            for (char c : S.toCharArray()) {
                sb.append(String.valueOf(c).repeat(R));
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
