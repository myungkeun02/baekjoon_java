package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class _2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'A') {
                answer += (int) ((s.charAt(i) - '0') * Math.pow(n, s.length() - 1 - i));
            } else {
                answer += (int) ((s.charAt(i) - 55) * Math.pow(n, s.length() - 1 - i));
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}