package Strings;
public class panagram {
    public boolean checkIfPangram(String sentence) {
        /*var arr = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a']++;
        }
        for (int i : arr) {
            if (i == 0) {
                return false;
            }
        }
        return true;*/
        char ch='a';
        for(int i=0 ; i<26 ; i++)
            if(sentence.contains(String.valueOf(ch)))
                ch++;
            else return false;
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        panagram obj = new panagram();
        System.out.println(obj.checkIfPangram(sentence));
    }
}