package 기하_직사각형과삼각형;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int x, y;
//
//        ArrayList<Integer> xList = new ArrayList<>();
//        ArrayList<Integer> yList = new ArrayList<>();
//
//        for (int i = 0; i < 3;  i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            xList.add(Integer.parseInt(st.nextToken()));
//            yList.add(Integer.parseInt(st.nextToken()));
//        }
//        Collections.sort(xList);
//        Collections.sort(yList);
//        x = xList.get(0) == xList.get(1) ? xList.get(2) : xList.get(1);
//        y = yList.get(0) == yList.get(1) ? yList.get(2) : yList.get(1);
//        bw.write(x + " " + y);

        int x1, y1, x2, y2, x3, y3;

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());

        // x와 y 각각에서 중복되지 않는 값을 찾기
        int x4 = (x1 == x2) ? x3 : (x1 == x3) ? x2 : x1;
        int y4 = (y1 == y2) ? y3 : (y1 == y3) ? y2 : y1;

        bw.write(x4 + " " + y4);
        bw.flush();
        bw.close();
        br.close();
    }
}
