package Strings;
import java.util.stream.IntStream;
public class MinStepToMakeTwoStringAnagram {
    public static int minSteps(String s, String t) {
        var arr = new int[256];
        IntStream.range(0, s.length()).forEach(i -> arr[s.charAt(i) - 'a']++);
        IntStream.range(0, t.length()).forEach(i -> arr[t.charAt(i) - 'a']--);
        return IntStream.range(0, 26).filter(i -> arr[i] > 0).map(i -> arr[i]).sum();
    }
    public static void main(String[] args) {
        var str1 = "leetcode";
        var str2 = "practice";
        System.out.println(minSteps(str1, str2));
    }
}
/*int[] count = new int[26];
        byte[] sb = s.getBytes(), tb = t.getBytes();
        for (byte b : sb) {
          count[b - 'a']++;
        }
        for (byte b : tb) {
          count[b - 'a']--;
        }
        int res = 0;
        for (int i : count) {
          res += Math.abs(i);
        }
        return res / 2;*/