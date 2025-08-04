package 자료구조.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        for (int i = 0; i < N; i++) {
            int target = sequence[i];

            while (num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }

            if (stack.isEmpty() || stack.peek() != target) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}
