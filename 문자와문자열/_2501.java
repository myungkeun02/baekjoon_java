package 문자와문자열;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int sqrt = (int) Math.sqrt(p);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++) {
            if (p % i == 0) {
                arrayList.add(i);
                if (p / i != i) {
                    arrayList.add(p / i);
                }
            }
        }
        Collections.sort(arrayList);
        if (q <= arrayList.size()) {
            bw.write(arrayList.get(q - 1) + "\n");
        } else {
            bw.write("0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
