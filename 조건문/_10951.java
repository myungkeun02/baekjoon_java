package 조건문;

import java.io.*;

public class _10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                break;
            }
            String[] tokens = input.split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            bw.write((a + b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}