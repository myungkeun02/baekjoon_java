package 문자와문자열;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int sqrt = (int) Math.sqrt(n);

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i <= sqrt; i++) {
                if (n % i == 0) {
                    list.add(i);
                    if (n / i != i && i != 1) {
                        list.add(n / i);
                    }
                }
            }


            int sum = list.stream().mapToInt(Integer::intValue).sum();

            if (sum != n) {
                bw.write(n + " is NOT perfect. " + "\n");
                continue;
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();

            sb.append(n).append(" = ");

            for (int j = 0; j < list.size() - 1; j++) {
                sb.append(list.get(j) + " + ");
            }
            sb.append(list.get(list.size() - 1));
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
