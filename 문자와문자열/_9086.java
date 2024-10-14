package 문자와문자열;

import java.io.*;

public class _9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String st = br.readLine();
            bw.write(st.charAt(0));
            bw.write(st.charAt(st.length() - 1));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
