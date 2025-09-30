package 프로그래머스.알고리즘_고득점_Kit.해시;

import java.util.HashMap;
import java.util.Map;

public class Programmers_42576 {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);
        for (String s : completion) map.put(s, map.getOrDefault(s, 0) - 1);

        // 1. keySet 사용
        for (String key : map.keySet()) {
            if (map.get(key) > 0) return key;
        }

        // 2. entrySet 사용
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return "";
    }
}
