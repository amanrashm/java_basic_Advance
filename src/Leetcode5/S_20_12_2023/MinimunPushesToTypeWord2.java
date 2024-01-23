package Leetcode5.S_20_12_2023;
import java.util.*;
public class MinimunPushesToTypeWord2 {
    public static int minimumPushes(String word) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : word.toCharArray())
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        TreeMap<Integer, List<Character>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (char c : charFreq.keySet()) {
            int freq = charFreq.get(c);
            sortedMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(c);
        }
        int pushes = 0, count = 0;
        for (Map.Entry<Integer, List<Character>> entry : sortedMap.entrySet()) {
            List<Character> chars = entry.getValue();
            int freq = entry.getKey();
            for (int i = 0; i < chars.size(); i++) {
                count++;
                pushes += freq * (count > 24 ? 4: (count > 16 ? 3:(count > 8  ? 2: 1)));
            }
        }
        return pushes;
    }
    public static void main(String[] args) {
        var word = "xycdefghij";
        var res = minimumPushes(word);
        System.out.println(res);
    }
}
/*var pushes = 8;
        var wordLength = word.length();
        if(wordLength <= 8) {
            return wordLength;
        }else if(wordLength <= 16) {
            var num = wordLength - 8;
            pushes += num * 2;
            if(wordLength % 2 == 0) {
                pushes -= 4;
            }else {
                pushes += 4;
            }
        }else if(wordLength <= 24) {
            var num = wordLength - 16;
            pushes += 16 + num * 3;
            pushes /= 2;
            pushes += 3;
        }
        else {
            var num = wordLength - 24;
            pushes += 16 + 24 + num * 4;
            pushes /= 2;
            pushes += 3;
        }
        return pushes;*/