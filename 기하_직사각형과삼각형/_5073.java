package 기하_직사각형과삼각형;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int[] ints = {a, b, c};
            Arrays.sort(ints);

            if (ints[0] + ints[1] > ints[2]) {
                if (ints[0] == ints[1] && ints[1] == ints[2]) {
                    bw.write("Equilateral\n");
                } else if (ints[0] == ints[1] || ints[1] == ints[2]) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
