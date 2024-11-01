package 문자와문자열;

import java.io.*;

public class _5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int dialTime = ((c - 'A') / 3) + 3;

            if(c == 'S' || c == 'V' || c == 'Y' || c == 'Z') {
                dialTime--;
            }
            totalTime += dialTime;
        }
        bw.write(String.valueOf(totalTime));
        bw.flush();
        bw.close();
        br.close();
    }
}
