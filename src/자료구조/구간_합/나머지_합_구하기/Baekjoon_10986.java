package 자료구조.구간_합.나머지_합_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수의 개수
        int M = Integer.parseInt(st.nextToken()); // 나눌 수
        long total = 0; //총 개수
        int[] remainderCount = new int[M]; //나머지 값 카운팅
        int[] prefixMod = new int[N + 1]; // 나머지 값 저장

        // 입력 수열 처리 및 누적합 계산
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            int num = Integer.parseInt((st.nextToken()));

            prefixMod[i] = (num + prefixMod[i - 1]) % M; // 누적합 구하고 M으로 나눈 나머지 저장

            // 누적합 자체가 M으로 나누어 떨어지는 경우
            if (prefixMod[i] == 0) {
                total++;
            }
            remainderCount[prefixMod[i]]++; // 해당 나머지의 개수 증가
        }

        // 나머지가 같은 누적합 쌍의 수 구하기
        for (int i = 0; i < M; i++) {
            if (remainderCount[i] > 1) {
                total += (long) remainderCount[i] * (remainderCount[i] - 1) / 2;
            }
        }
        System.out.println(total);
    }
}
