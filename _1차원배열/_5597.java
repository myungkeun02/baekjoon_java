package _1차원배열;

import java.io.*;
import java.util.ArrayList;

public class _5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 28; i ++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            sum += num;
        }
        int gap = 465 - sum;

        for (int i = 1; i <= 30; i ++) {
            if(!list.contains(i)) {
                bw.write(i + "\n");
                if (i != gap - i) {
                    bw.write((gap - i) + "\n");
                }
                break;
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
