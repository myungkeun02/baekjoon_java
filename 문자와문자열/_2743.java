package 문자와문자열;

import java.io.*;

public class _2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.write(String.valueOf(s.length()));
        bw.flush();
        br.close();
        bw.close();
    }
}
