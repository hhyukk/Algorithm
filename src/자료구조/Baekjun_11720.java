package 자료구조;

import java.io.*;

public class Baekjun_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String number = br.readLine();

        int sum = number.chars() // 문자열을 IntStream으로 변환
                .limit(t) // 첫 t개의 문자만 처리
                .map(c -> c - '0') // 각 문자를 숫자로 변환
                .sum(); // 합산

        System.out.println(sum);
    }
}
