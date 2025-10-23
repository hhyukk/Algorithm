package 프로그래머스.알고리즘_고득점_Kit.해시;

import java.util.*;

public class Programmers_42578 {
    public static void main(String[] args) {

    }

    class Solution_1 {
        public int solution(String[][] clothes) {
            int answer = 1;
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }
            for (int i : map.values()) {
                answer *= (i + 1);
            }
            return --answer;
        }
    }

    class Solution_2 {

        public int solution(String[][] clothes) {
            Map<String, Integer> clothMap = new HashMap<>();

            // 각 의상 종류별 개수 누적
            for (String[] cloth : clothes) {
                clothMap.merge(cloth[1], 1, Integer::sum);
            }

            int answer = 1;

            // 각 종류마다 (선택 + 미선택) 경우의 수 곱셈
            for (int kinds : clothMap.values()) {
                answer *= kinds + 1;
            }

            // 아무 것도 입지 않는 경우 제외
            return answer - 1;
        }

    }

    class Solution_3 {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> map = new HashMap<>();
            for (String[] now : clothes) {
                map.compute(now[1], (k, ov) -> (ov == null ? 2 : ov + 1));
            }

            for (int now : map.values()) {
                answer *= now;
            }
            return answer - 1;
        }
    }
}
