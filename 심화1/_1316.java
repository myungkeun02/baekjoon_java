package 심화1;

import java.io.*;
import java.util.ArrayList;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            ArrayList<Character> list = new ArrayList();
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (list.contains(c)) {
                    if (c !=s.charAt(j-1)) {
                        flag = false;
                        break;
                    }
                } else {
                    list.add(c);
                }
            }
            if (flag) {
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        br.close();
        bw.close();
    }
}


