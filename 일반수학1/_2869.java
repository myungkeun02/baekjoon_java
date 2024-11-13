package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int S = 0;

        int answer = (V - B -1) / (A - B) + 1;


        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
