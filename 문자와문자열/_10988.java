package 문자와문자열;

import java.io.*;

public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringBuffer sb = new StringBuffer(s).reverse();
        bw.write(s.contentEquals(sb) ? "1" : "0");
        bw.flush();
        bw.close();
        br.close();
    }
}
