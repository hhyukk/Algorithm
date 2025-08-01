package 자료구조.슬라이딩_윈도우.최솟값_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] array = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int start = 1 - L + 1;
        int end = 1;
        while (end <= N) {
            long min = 999999999;
            for (int i = start; i <= end; i++) {
                if (i > 0) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
            }
            System.out.print(min);
            start++;
            end++;
        }
    }
}
