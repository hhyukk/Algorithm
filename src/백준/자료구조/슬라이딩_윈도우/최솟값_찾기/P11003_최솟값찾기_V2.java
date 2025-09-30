package 백준.자료구조.슬라이딩_윈도우.최솟값_찾기;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11003_최솟값찾기_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> deque = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            int value = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임

            while (!deque.isEmpty() && deque.peekLast().value > value) {
                deque.pollLast();
            }
            deque.offerLast(new Node(value, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if (deque.peekFirst().index <= i - L) {
                deque.pollFirst();
            }
            bw.write(deque.peekFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
