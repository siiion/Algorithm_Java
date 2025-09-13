import java.util.*;

class Solution {
    static class Track {
        int id;
        int plays;
        Track(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<Track>> genreTracks = new HashMap<>();
        
        // 장르 별 총 재생 횟수
        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];
            genreTotal.put(g, genreTotal.getOrDefault(g, 0) + p);
            genreTracks.computeIfAbsent(g, k -> new ArrayList<>())
                .add(new Track(i, p));
        }
        
        // 장르 재생 횟수에 따라 정렬하기
        List<String> orderedGenres = new ArrayList<>(genreTotal.keySet());
        orderedGenres.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));
        
        // 장르 내에서 재생 횟수, 고유 번호에 따라 트랙(노래) 정렬하기
        for (List<Track> list : genreTracks.values()) {
            list.sort((t1, t2) -> {
                if (t1.plays != t2.plays) return t2.plays - t1.plays;
                return t1.id - t2.id;
            });
        }
        
        // 장르별로 최대 2개의 노래씩 
        List<Integer> result = new ArrayList<>();
        for (String g : orderedGenres) {
            List<Track> list = genreTracks.get(g);
            for (int i = 0; i < list.size() && i < 2; i++) {
                result.add(list.get(i).id);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}