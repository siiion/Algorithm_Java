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
        
        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];
            genreTotal.put(g, genreTotal.getOrDefault(g, 0) + p);
            genreTracks.computeIfAbsent(g, k -> new ArrayList<>())
                .add(new Track(i, p));
        }
        
        List<String> orderedGenres = new ArrayList<>(genreTotal.keySet());
        orderedGenres.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));
        
        for (List<Track> list : genreTracks.values()) {
            list.sort((t1, t2) -> {
                if (t1.plays != t2.plays) return t2.plays - t1.plays;
                return t1.id - t2.id;
            });
        }
        
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