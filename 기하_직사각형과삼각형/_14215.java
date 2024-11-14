package 기하_직사각형과삼각형;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _14215 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sides = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        Arrays.sort(sides);

        if (sides[2] >= sides[1] + sides[0]) {
            bw.write(String.valueOf((sides[1] + sides[0]) * 2 - 1));
        } else {
            bw.write(String.valueOf((sides[0] + sides[1] + sides[2])));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
