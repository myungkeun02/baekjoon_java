package 문자와문자열;

import java.io.*;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            int index = s.indexOf(c);
            if (index >= 0) {
                bw.write(String.valueOf(index));
            } else {
                bw.write("-1");
            }
            bw.write(" ");  // 각 결과 사이에 공백 추가
        }
        bw.flush();
        br.close();
        bw.close();
    }
}