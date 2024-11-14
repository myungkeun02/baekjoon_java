package 기하_직사각형과삼각형;

import java.io.*;

public class _15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        bw.write(String.valueOf(n * 4));
        bw.flush();
        bw.close();
        br.close();
    }
}
