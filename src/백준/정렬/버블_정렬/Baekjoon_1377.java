package 백준.정렬.버블_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Sort implements Comparable<Sort> {
    int value;
    int index;

    public Sort(int value, int index) {
        // super()는 Java가 자동으로 삽입
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Sort o) {
        // return this.value - o.value; 보다 Integer.compare를 사용하는 게 언더플로우방지에 좋음
        return Integer.compare(this.value, o.value);
    }
}

public class Baekjoon_1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Sort[] A = new Sort[N];
        for (int i = 0; i < N; i++) {
            A[i] = new Sort(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(A);
        int Max = 0;
        for (int i = 0; i < N; i++) {
            if (Max < A[i].index - i) {
                Max = A[i].index - i;
            }
        }
        System.out.println(Max + 1);
    }
}
