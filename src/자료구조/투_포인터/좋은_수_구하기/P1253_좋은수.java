package 자료구조.투_포인터.좋은_수_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 수의 개수
        int count = 0; // 좋은 수 개수

        // 수 배열 입력 받기
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬 (투 포인터 사용을 위함)
        Arrays.sort(array);

        // 각 수가 좋은 수인지 판단
        for (int i = 0; i < N; i++) {
            int target = array[i]; // 현재 검사할 수
            int start = 0;
            int end = N - 1;

            while (start < end) {
                // 자기 자신은 포함하면 안 됨
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }

                int sum = array[start] + array[end];

                if (sum == target) {
                    count++; // 좋은 수 발견
                    break;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}
