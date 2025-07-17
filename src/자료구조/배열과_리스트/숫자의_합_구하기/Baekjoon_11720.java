package 자료구조.배열과_리스트.숫자의_합_구하기;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int sum = 0;
        String numbers = input.next();

        for (int i = 0; i < count; i++) {
            sum += numbers.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
