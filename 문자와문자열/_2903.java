package 문자와문자열;

import java.io.*;

public class _2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sidePoints = (int) Math.pow(2, n) + 1;
        int totalPoints = sidePoints * sidePoints;

        bw.write(totalPoints + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
