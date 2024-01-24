package Strings;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message){
        var result = new StringBuilder();
        var table = new char[26];
        var index = 0;
        for(var i = 0; i < key.length(); i++){
            var ch = key.charAt(i);
            if(ch != ' ' && table[ch - 'a'] == 0){
                table[ch - 'a'] = (char)('a' + index);
                index++;
            }
        }
        return result.toString();
    }
    public static void main(String... args){
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }
}
