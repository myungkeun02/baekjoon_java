package 시간복잡도;

import java.io.*;

public class _24263 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        bw.write(n + "\n");
        bw.write("1");
        bw.flush();
        bw.close();
        br.close();
    }
}
