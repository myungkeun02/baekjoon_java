package 시간복잡도;

import java.io.*;

public class _24264 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        long n;
        if (input == null || input.isEmpty()) {
            n = 0;
        } else {
            n = Long.parseLong(input);
        }

        bw.write(n*n + "\n");
        bw.write("2");
        bw.flush();
        bw.close();
        br.close();
    }
}
