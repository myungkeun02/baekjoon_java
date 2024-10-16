package 문자와문자열;

import java.io.*;
import java.util.StringTokenizer;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int num = Character.getNumericValue(nums.charAt(i));
            answer = answer + num;
        }
        bw.write(answer + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
