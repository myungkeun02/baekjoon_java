package 문자와문자열;

import java.io.*;

public class _11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;

        while ((s = br.readLine()) != null) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}


//public class _11718 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        while (true){
//            String s = br.readLine();
//            if (s.isEmpty() || !s.trim().equals(s)){
//                break;
//            }
//            bw.write(s + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}
