package 백준.자료구조.배열과_리스트.평균_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int countN = Integer.parseInt(br.readLine());

        double[] scores = new double[countN];
        double maxScore = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < countN; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            maxScore = Math.max(maxScore, scores[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < countN; i++) {
            sum += (scores[i] / maxScore) * 100;
        }

        double average = sum / countN;
        System.out.println(average);
    }
}
