package 자료구조.투_포인터.주몽의_명령;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int start = 0;
        int end = N - 1;
        int count = 0;

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while (start < end) {
            int value = arr[start] + arr[end];
            if (value < M) {
                start++;
            } else if (value == M) {
                count++;
                end--;
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}
