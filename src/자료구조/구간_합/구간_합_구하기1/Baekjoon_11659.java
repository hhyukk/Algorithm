package 자료구조.구간_합.구간_합_구하기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 수의 개수
        int m = Integer.parseInt(st.nextToken()); // 구간 합 구할 횟수

        //
        int[] prefixSum = new int[n + 1]; // 누적 합 배열

        // 두 번째 줄: 수열 입력 및 누적합 계산
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + num;
        }

        // M개의 구간 합 쿼리 처리
        StringBuilder sb = new StringBuilder(); // 출력 최적화
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int sum = prefixSum[end] - prefixSum[start - 1];
            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
