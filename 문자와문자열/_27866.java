package 문자와문자열;

import java.io.*;
import java.util.StringTokenizer;

public class _27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        char result = s.charAt(i-1);

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
