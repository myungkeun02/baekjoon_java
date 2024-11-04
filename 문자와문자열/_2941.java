package 문자와문자열;

import java.io.*;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        String s = br.readLine();
        String[] croatianAlphabets = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;

            for (String croatianAlphabet : croatianAlphabets) {
                if (i + croatianAlphabet.length() <= s.length() && s.substring(i, i + croatianAlphabet.length()).equals(croatianAlphabet)) {
                    answer++;
                    i += croatianAlphabet.length() - 1;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
