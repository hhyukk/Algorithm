package 백준.정렬.선택_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numberStr = br.readLine();
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        // 선택 정렬: 가장 큰 수를 앞으로 보내기
        for (int i = 0; i < digits.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[maxIndex] < digits[j]) {
                    maxIndex = j;
                }
            }

            // Swap
            int temp = digits[i];
            digits[i] = digits[maxIndex];
            digits[maxIndex] = temp;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        System.out.println(sb);
    }
}
