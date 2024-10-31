package 문자와문자열;

import java.io.*;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine().trim();

        if (S.isEmpty()) {
            bw.write("0");
        } else {
            String[] words = S.split(" +");
            bw.write(String.valueOf(words.length));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
