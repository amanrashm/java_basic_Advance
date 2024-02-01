package Arrays;
import java.util.Arrays;
public class DailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        var len = temperatures.length;
        var answer = new int [len];
        var left = 0;
        var right = 0;
        while (left < len) {
            if (right < len && temperatures[left] < temperatures[right]) {
                answer[left] = right - left;
                left += 1;
                right = left + 1;
            }
            else if (right < len){
                right += 1;
            }
            else {
                left += 1;
                right = left + 1;
            }
        }
        return answer;
    }
    public static void main(String... args){
        var temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
