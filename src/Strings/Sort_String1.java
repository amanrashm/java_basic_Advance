package Strings;
public class Sort_String1 {
    public static String sorted(String str){
        char temp;
        char [] ch = str.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(ch[i] > ch[j]){
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        String arr = "Aman";
        System.out.println(sorted(arr));
    }
}