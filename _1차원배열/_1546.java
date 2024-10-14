package _1차원배열;

import java.io.*;
import java.util.Arrays;


public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        double[] arr = Arrays.stream(numbers).mapToDouble(Double::parseDouble).toArray();
        double m = Arrays.stream(arr).max().getAsDouble();
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / m * 100;
        }
        double result = (Arrays.stream(arr).sum() / n);
        bw.write(String.format("%.6f", result));
        bw.flush();
        br.close();
        bw.close();
    }
}
