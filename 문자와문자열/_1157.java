package 문자와문자열;

import java.io.*;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
        }

        int maxCount = 0;
        char mostFrequent = '?';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) (i + 'A');
            } else if (freq[i] == maxCount) {
                mostFrequent = '?';
            }
        }
        bw.write(mostFrequent);
        bw.flush();
        bw.close();
        br.close();
    }
}
