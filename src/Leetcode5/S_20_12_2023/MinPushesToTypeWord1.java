package Leetcode5.S_20_12_2023;
public class MinPushesToTypeWord1 {
    public static int minimumPushes(String word) {
        var pushes = 8;
        var wordLength = word.length();
        if(wordLength <= 8) {
            return wordLength;
        }else if(wordLength <= 16) {
            var num = wordLength - 8;
            pushes += num * 2;
        }else if(wordLength <= 24) {
            var num = wordLength - 16;
            pushes += 16 + num * 3;
        }
        else{
            var num = wordLength - 24;
            pushes += 16 + 24 + num * 4;
        }
        return pushes;
    }
    public static void main(String[] args) {
        var word = "afhtgpque";
        var res = minimumPushes(word);
        System.out.println(res);
    }
}