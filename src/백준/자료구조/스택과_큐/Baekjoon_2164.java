package 백준.자료구조.스택과_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지의 숫자를 큐에 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 큐의 크기가 1이 될 때까지 반복
        while (queue.size() > 1) {
            queue.poll(); // 제일 위 카드 버리기
            queue.add(queue.poll()); // 그 다음 카드를 맨 뒤로 보내기
        }

        // 마지막 남은 카드 출력
        System.out.println(queue.peek());
    }
}
