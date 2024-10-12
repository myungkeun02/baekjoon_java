package _1차원배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class _10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer option = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(option.nextToken());
        int m = Integer.parseInt(option.nextToken());

        int[] answer = IntStream.range(1, n + 1).toArray();

        for (int i = 0; i < m; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int num1Index = Integer.parseInt(str.nextToken()) - 1;
            int num2Index = Integer.parseInt(str.nextToken()) - 1;
            int setNum1 = answer[num2Index];
            int setNum2 = answer[num1Index];

            answer[num1Index] = setNum1;
            answer[num2Index] = setNum2;
        }
        String result = String.join(" ", Arrays.stream(answer).mapToObj(String::valueOf).toArray(String[]::new));
        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
