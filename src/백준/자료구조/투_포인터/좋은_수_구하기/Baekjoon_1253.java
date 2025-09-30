package 백준.자료구조.투_포인터.좋은_수_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //수의 개수
        int start = 0;
        int end = 1;
        int count = 0;

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int[] countArray = new int[N];

        while (start < N - 1) {
            int value = A[start] + A[end];
            for (int i = 1; i < N - 1; i++) {

                if (value == A[end + i]) {
                    count++;
                } else if (value > A[end + i]) {
                } else {
                    break;
                }
            }
            start++;
        }
        System.out.println(count);
    }
}

// 실패!!
//0 0 0 0에 대한 테스트 오류!
//예상값: 0
//출력값: 6
//count를 올릴 때 이미 올린 값에 대한 중복 검사 실패