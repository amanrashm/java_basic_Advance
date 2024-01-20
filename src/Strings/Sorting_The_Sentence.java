package Strings;
public class Sorting_The_Sentence {
    public static String sortSentence(String s) {
        var str = s.split(" ");
        var arr = new String[str.length];
        for (String value : str) {
            var index = Integer.parseInt(value.substring(value.length() - 1));
            arr[index - 1] = value.substring(0, value.length() - 1);
        }
        return String.join(" ", arr);
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}