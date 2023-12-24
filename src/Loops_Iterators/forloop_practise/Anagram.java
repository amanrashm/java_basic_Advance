package Loops_Iterators.forloop_practise;

import java.util.Scanner;

public class Anagram {
    // What is Anagram ?
    // It should follow such conditions
    // Size/length of both the string is same
    // along with this it should have same characters available in the string
    // it can be at any place, but it must be available
    // also number of characters should repeat same number of times
    // also can take different approach check the occurrence of character and
    // if all the characters are same in count to another string character then its anagram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var str1 = sc.next();
        var str2 = sc.next();
        var isAnagram = true;

        // default value of boolean is false;
        /*boolean[] visited = new boolean[str2.length()];

        if (str2.length() == str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                var c = str1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == c & !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }*/
        int[] al = new int[256];
        int[] bl = new int[256];
        for (var c : str1.toCharArray()){
            var index = (int) c;
            al[index]++;
        }
        for (var c : str2.toCharArray()){
            var index = (int) c;
            bl[index]++;
        }
        for (var i = 0; i < 256; i++) {
            if(al[i] != bl[i]){
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println(str1 + ", " + str2 + " is Anagram.");
        } else {
            System.out.println(str1 + ", " + str2 + " is not Anagram.");
        }
    }
}