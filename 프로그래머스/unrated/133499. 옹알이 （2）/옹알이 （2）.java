import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i=0; i<babbling.length; i++) {
            String a = babbling[i];
            a = a.replace("aya","1");
            a = a.replace("ye", "2");
            a = a.replace("woo","3");
            a = a.replace("ma","4");
            if (a.matches(".*[a-zA-Z].*")) {
            } else if (a.contains("11") || a.contains("22") || a.contains("33") || a.contains("44")){
            } else {
               answer++;
            }
            
        }
            
        return answer;
    }
}