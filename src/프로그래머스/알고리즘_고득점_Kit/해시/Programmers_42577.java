package 프로그래머스.알고리즘_고득점_Kit.해시;

import java.util.Arrays;

public class Programmers_42577 {
}

// indexOf 사용
class Solution_1 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].indexOf(phone_book[i]) == 0) return false;
        }
        return true;
    }
}

// startsWith 사용
class Solution_2 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}