package _2차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int w = 0;
        int h = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a >= max) {
                    max = a;
                    w = i + 1;
                    h = j + 1;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(w + " " + h);
        bw.flush();
        bw.close();
        br.close();
    }
}
