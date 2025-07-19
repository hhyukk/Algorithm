package 자료구조.투_포인터.좋은_수_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        for (int i = 0; i < N; i++) {
            int target = array[i];
            int start = 0;
            int end = N - 1;
            while (start < end) {
                if (array[start] + array[end] > array[i]) {
                    end--;
                } else if (array[start] + array[end] == array[i]) {
                    if (start != i && end != i) {
                        count++;
                        break;
                    }
                } else if (array[start] + array[end] < array[i]) {
                    start++;
                }
            }
        }

        System.out.println(count);
    }
}
