package 심화1;

import java.io.*;

public class _25206 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            String s = br.readLine();
            String lastChar = String.valueOf(s.charAt(s.length() - 1));

            if (lastChar.equals("P")) {
                continue;
            }

            int dotIndex = s.indexOf(".");
            double credit = Double.parseDouble(s.substring(dotIndex - 1, dotIndex + 2));
            String grade = s.substring(s.length() - 2);

            double gradeValue = 0;
            if (grade.equals("A+")) gradeValue = 4.5;
            else if (grade.equals("A0")) gradeValue = 4.0;
            else if (grade.equals("B+")) gradeValue = 3.5;
            else if (grade.equals("B0")) gradeValue = 3.0;
            else if (grade.equals("C+")) gradeValue = 2.5;
            else if (grade.equals("C0")) gradeValue = 2.0;
            else if (grade.equals("D+")) gradeValue = 1.5;
            else if (grade.equals("D0")) gradeValue = 1.0;

            sum += credit * gradeValue;
            totalCredits += credit;
        }

        double result = sum / totalCredits;
        bw.write(String.format("%.6f", result));
        bw.flush();
        bw.close();
        br.close();
    }
}
