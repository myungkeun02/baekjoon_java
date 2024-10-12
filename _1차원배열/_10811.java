package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class _10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer option = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(option.nextToken());
        int m = Integer.parseInt(option.nextToken());

        int[] nums = IntStream.rangeClosed(1, n).toArray();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1Index = Integer.parseInt(st.nextToken()) - 1;
            int num2Index = Integer.parseInt(st.nextToken()) - 1;

            while (num1Index < num2Index) {
                int temp = nums[num1Index];
                nums[num1Index] = nums[num2Index];
                nums[num2Index] = temp;
                num1Index++;
                num2Index--;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(nums[i]));
            if (i < n - 1) {
                bw.write(" ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}