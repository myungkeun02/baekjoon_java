package 일반수학1;

import java.io.*;

public class _2720 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            result[0] =  C / 25;
            C %= 25;
            result[1] = C / 10;
            C %= 10;
            result[2] = C / 5;
            C %= 5;
            result[3] = C;
            bw.write(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
