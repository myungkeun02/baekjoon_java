package 문자와문자열;

import java.io.*;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int reversedNum1 = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int reversedNum2 = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        int result = Math.max(reversedNum1, reversedNum2);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
