package Strings;
public class FaultyKeyBoard {
    public static String finalString(String s) {
        var sb = new StringBuilder();
        var ch = s.toCharArray();
        var i = 0;
        for (; i < ch.length; i++) {
            if ((ch[i] == 'i')) {
                sb.reverse();
            }else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        var s = "poiinter";
        var res = finalString(s);
        System.out.println(res);
    }
}
// TODO: learn this logic
/*char[] result = new char[s.length()];
      int index = 0;
      for(char c:s.toCharArray()){
            if(c == 'i'){
              int start = 0;
              int end = index-1;
              while(start < end){
                  char temp = result[start];
                  result[start] = result[end];
                  result[end] = temp;
                  start++;
                  end--;
              }
            }else{
                  result[index] = c;
                  index++;
            }
      }
      return new String(result,0,index);*/