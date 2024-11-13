package 심화1;

import java.io.*;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer sample = new StringTokenizer("1 1 2 2 2 8");

        for (int i = 0; i < 6; i ++) {
            bw.write(Integer.parseInt(sample.nextToken()) - Integer.parseInt(st.nextToken()) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
