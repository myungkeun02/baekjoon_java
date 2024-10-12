package _1차원배열;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class _3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()) % 42);
        }
        HashSet<Integer> set = new HashSet<>(list);
        bw.write(set.size() + "\n");
        bw.flush();
        br.close();
        br.close();
    }
}
