package 자료구조.스택과_큐;

import java.io.*;
import java.util.*;

public class Baekjoon_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 수열의 크기 입력
        int[] array = new int[N]; // 입력한 수열 배열
        int[] answer = new int[N]; //정답 배열

        // 수열 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            // 현재 원소가 스택 top 인덱스에 해당하는 원소보다 크다면 → 오큰수 조건 만족
            while (!stack.isEmpty() && array[i] > array[stack.peek()]) {
                answer[stack.pop()] = array[i]; // 해당 인덱스의 오큰수는 현재 값
            }
            stack.push(i);
        }

        // 스택에 남아 있는 인덱스들은 오큰수가 없으므로 -1로 설정
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : answer) {
            sb.append(val).append(' ');
        }

        System.out.println(sb);
    }
}
