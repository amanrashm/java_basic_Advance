package Strings;
public class Max_Words {
    public static int mostWordsFound(String[] sentences) {
        var mostWordsFound = 0;
        for (String currSentence : sentences) {
            var currLen = currSentence.split(" ").length;
            if (mostWordsFound < currLen)
                mostWordsFound = currLen;
        }
        return mostWordsFound;
    }
    public static void main(String[] args) {
        var sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}