package 문자와문자열;

import java.io.*;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int group = 1;
        int sum = 0;

        while (sum + group < X) {
            sum += group;
            group++;
        }

        int position = X - sum;
        int numerator, denominator;

        if (group % 2 == 0) { // 짝수 그룹인 경우: 분모가 작고 분자가 큰 순서
            numerator = position;
            denominator = group - position + 1;
        } else { // 홀수 그룹인 경우: 분자가 작고 분모가 큰 순서
            numerator = group - position + 1;
            denominator = position;
        }
        bw.write(numerator + "/" + denominator);
        bw.flush();
        bw.close();
        br.close();
    }
}
