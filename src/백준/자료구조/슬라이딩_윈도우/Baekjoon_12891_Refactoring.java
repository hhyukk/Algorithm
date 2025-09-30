package 백준.자료구조.슬라이딩_윈도우;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_12891_Refactoring {
    static int[] currentCount = new int[4]; // 현재 윈도우 내 문자 개수
    static int[] requiredCount = new int[4]; // {A, C, G, T} 최소 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 전체 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 길이

        char[] dna = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            requiredCount[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        // 초기 윈도우 설정
        for (int i = 0; i < P; i++) {
            addChar(dna[i]);
        }

        if (checkPassword()) result++;

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            removeChar(dna[i - P]);
            addChar(dna[i]);
            if (checkPassword()) result++;
        }

        System.out.println(result);
    }

    private static void addChar(char c) {
        currentCount[charToIndex(c)]++;
    }

    private static void removeChar(char c) {
        currentCount[charToIndex(c)]--;
    }

    private static boolean checkPassword() {
        for (int i = 0; i < 4; i++) {
            if (currentCount[i] < requiredCount[i]) return false;
        }
        return true;
    }

    private static int charToIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                throw new IllegalArgumentException("Invalid DNA character: " + c);
        }
    }
}
