package CodeChef1000_1400;
public class ChefAndHisStudents {
    public static void main(String... args) {
        var sc = new java.util.Scanner(System.in);
        var t = sc.nextInt();
        while(t --> 0) {
            var s = sc.next();
            var ch =s.toCharArray();
            countPairs(ch);

        }
    }
    private static void countPairs(char[] ch) {
        var count = 0;
        for(var i = 0; i < ch.length - 1; ++i) {
            if(ch[i] == '<' && ch[i + 1] == '>') {
                ++count;
            }
        }
        System.out.println(count);
    }
}