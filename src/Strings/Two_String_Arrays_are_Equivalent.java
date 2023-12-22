package Strings;
public class Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String value : word1) {
            str1.append(value);
        }
        for (String s : word2) {
            str2.append(s);
        }
        return str1.toString().equals(str2.toString());
    }
    public static void main(String[] args) {
        String [] word1 = {"abc", "d", "defg"};
        String [] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}