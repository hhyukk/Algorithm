package 백준.자료구조.슬라이딩_윈도우;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_12891 {
    static int[] mineCountCheck = new int[4];
    static boolean check = true;
    static int[] mineCount = new int[4]; //{‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); //임의로 만든 DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken()); //비밀번호로 사용할 부분문자열의 길이

        String DNAString = br.readLine();
        char[] DNAStringArray = DNAString.toCharArray(); //임의로 만든 DNA 문자열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < mineCount.length; i++) {
            mineCount[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = start + P - 1;
        int result = 0;
        for (int i = start; i <= end; i++) {
            plusSwitch(DNAStringArray[i]);
        }
        for (int i = 0; i < 4; i++) {
        }

        result += equals();
        start++;
        end++;

        while (end < S) {
            minusSwitch(DNAStringArray[start - 1]);
            plusSwitch(DNAStringArray[end]);
            for (int i = 0; i < 4; i++) {
            }
            result += equals();
            start++;
            end++;
        }
        System.out.println(result);
    }

    public static void plusSwitch(char c) {
        switch (c) {
            case 'A':
                mineCountCheck[0]++;
                break;
            case 'C':
                mineCountCheck[1]++;
                break;
            case 'G':
                mineCountCheck[2]++;
                break;
            case 'T':
                mineCountCheck[3]++;
                break;
        }
    }

    public static int equals() {
        for (int i = 0; i < 4; i++) {
            if (mineCount[i] > mineCountCheck[i]) {
                check = false;
                break;
            }
        }
        if (check) {
            return 1;
        }
        check = true;
        return 0;
    }

    public static void minusSwitch(char c) {
        switch (c) {
            case 'A':
                mineCountCheck[0]--;
                break;
            case 'C':
                mineCountCheck[1]--;
                break;
            case 'G':
                mineCountCheck[2]--;
                break;
            case 'T':
                mineCountCheck[3]--;
                break;
        }
    }
}