package 자료구조.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 절댓값 기준 최소 힙 (절댓값이 같다면 실제 값이 작은 순)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA != absB) {
                return absA - absB;  // 절댓값이 작은 순
            } else {
                return a - b;        // 절댓값 같으면 실제 값이 작은 순
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.offer(x);
            } else {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append('\n');
            }
        }

        System.out.print(sb);
    }
}
