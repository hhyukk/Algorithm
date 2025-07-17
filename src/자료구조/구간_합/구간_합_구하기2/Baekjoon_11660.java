package 자료구조.구간_합.구간_합_구하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 표의 크기 N
        int M = Integer.parseInt(st.nextToken()); // 질의 개수 M
        
        int[][] prefixSum = new int[N + 1][N + 1]; // 구간 합을 저장할 2차원 배열 (1-indexed)

        // prefixSum 계산
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());
                prefixSum[i][j] = num
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }

        // 질의 처리
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = prefixSum[x2][y2]
                    - prefixSum[x1 - 1][y2]
                    - prefixSum[x2][y1 - 1]
                    + prefixSum[x1 - 1][y1 - 1];

            System.out.println(result);
        }
    }
}
