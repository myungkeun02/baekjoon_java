package 시간복잡도;

import java.io.*;

public class _24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        long n;

        if ( s == null || s.isEmpty()) {
            n = 0;
        } else {
            n = Long.parseLong(s);
        }

        bw.write(n * n * n + "\n");
        bw.write("3");
        bw.flush();
        bw.close();
        br.close();
    }
}
