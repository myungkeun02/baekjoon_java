package 시간복잡도;

import java.io.*;

public class _24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 파싱
        String[] input = br.readLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a0 = Integer.parseInt(input[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // Big-O 판별 로직
        int result = 0;
        if (c >= a1) {
            // c ≥ a1인 경우, a0 ≤ (c - a1) * n0 확인
            if (a0 <= (long)(c - a1) * n0) {
                result = 1;
            }
        }

        // 결과 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
