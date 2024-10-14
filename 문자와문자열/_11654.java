package 문자와문자열;

import java.io.*;

public class _11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int asciiCode = (int)br.readLine().charAt(0);

        bw.write(asciiCode + "");
        br.close();
        bw.close();
    }
}
