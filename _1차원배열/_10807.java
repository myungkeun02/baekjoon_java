package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int f = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int l = Integer.parseInt(br.readLine());
        for (String token : tokens) {
            if (Integer.parseInt(token) != l) {
                f -= 1;
            }
        }
        bw.write(f + "\n");
        br.close();

        bw.flush();
        bw.close();
    }
}
