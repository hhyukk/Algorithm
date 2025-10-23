package 프로그래머스.알고리즘_고득점_Kit.해시;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers_42579 {
    static class Song {
        int idx, plays;

        Song(int idx, int plays) {
            this.idx = idx;
            this.plays = plays;
        }
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        Map<String, Integer> total = new HashMap<>();
        Map<String, List<Song>> byGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];
            total.put(g, total.getOrDefault(g, 0) + p);
            byGenre.computeIfAbsent(g, k -> new ArrayList<>()).add(new Song(i, p));
        }

        List<String> order = new ArrayList<>(total.keySet());
        order.sort((a, b) -> total.get(b) - total.get(a));

        List<Integer> answer = new ArrayList<>();
        for (String g : order) {
            List<Song> list = byGenre.get(g);

            list.sort((s1, s2) -> {
                if (s2.plays != s1.plays) return s2.plays - s1.plays;
                return s1.idx - s2.idx;
            });

            answer.add(list.get(0).idx);
            if (list.size() >= 2) answer.add(list.get(1).idx);
        }
        System.out.println("🎯 최종 결과 인덱스: " + answer);
    }
}
