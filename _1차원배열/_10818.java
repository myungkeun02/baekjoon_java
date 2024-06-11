package _1차원배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] insts = new int[N];
        while (st.hasMoreTokens()) {
            insts[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(insts);
        bw.write(insts[0]+ " "+ insts[N-1]);

        br.close();
        bw.flush();
        bw.close();
    }
}
