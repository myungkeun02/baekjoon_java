package _1차원배열;

import java.io.*;

public class _10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] req = br.readLine().split(" ");
        int N = Integer.parseInt(req[0]);
        int X = Integer.parseInt(req[1]);
        String[] tokens = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(tokens[i]) < X) {
                bw.write(tokens[i] + " ");
            }
        }
        br.close();
        bw.flush();

        bw.close();
    }
}
