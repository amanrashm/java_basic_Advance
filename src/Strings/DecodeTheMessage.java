package Strings;
/*You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message*/
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
