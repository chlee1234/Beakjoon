import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            if (cache.remove(s)) {
                answer += 1;
                cache.add(s);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(s);
            }
        }
        return answer;
    }
}