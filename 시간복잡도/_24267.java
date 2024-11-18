package 시간복잡도;

import java.io.*;

public class _24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        long n = 0;
        if (input != null && !input.isEmpty()) {
            n = Long.parseLong(input);
        }

        long code1Count = (n * (n - 1) * (n - 2)) / 6;

        int timeComplexity = 3;

        bw.write(code1Count + "\n");
        bw.write(timeComplexity + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
