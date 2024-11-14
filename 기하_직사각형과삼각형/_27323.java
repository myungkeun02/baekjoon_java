package 기하_직사각형과삼각형;

import java.io.*;

public class _27323 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int result = A * B;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
