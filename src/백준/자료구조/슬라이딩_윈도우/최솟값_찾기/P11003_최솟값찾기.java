package 백준.자료구조.슬라이딩_윈도우.최솟값_찾기;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11003_최솟값찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        int[] array = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            array[i] = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && array[deque.peekLast()] > array[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (deque.peekFirst() <= i - L) {
                deque.pollFirst();
            }
            bw.write(array[deque.peekFirst()] + " ");
        }
        bw.flush();
        bw.close();
    }
}
