package Codechef.starter113.Starter119;

import java.util.Scanner;

public class Judged {
    public static void main(String... args){
        var scanner = new Scanner(System.in);
        var T = scanner.nextInt();
        for (var t = 0; t < T; t++) {
            var responses = new int[5];
            for (var i = 0; i < 5; i++) {
                responses[i] = scanner.nextInt();
            }
            if (countLikes(responses) >= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static int countLikes(int[] responses) {
        var count = 0;
        for (var response : responses) {
            if (response == 1) {
                count++;
            }
        }
        return count;
    }
}