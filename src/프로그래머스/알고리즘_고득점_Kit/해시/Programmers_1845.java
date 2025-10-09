package 프로그래머스.알고리즘_고득점_Kit.해시;

import java.util.*;

public class Programmers_1845 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] nums) {
            // 서로 다른 종류 개수를 구한다
            Set<Integer> kinds = new HashSet<>();
            for (int n : nums) kinds.add(n);

            int pick = nums.length / 2;        // 선택 가능한 마리 수
            return Math.min(kinds.size(), pick);
        }
    }
}
