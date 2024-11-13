package _2차원배열;

import java.io.*;
import java.util.ArrayList;

public class _10798 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }

        for (int i = 0; i < 15; i++) {
            for (String s : list) {
                if (i < s.length()) {
                    bw.write(s.charAt(i));
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
