package Arrays;
public class CountElementswithmaximumfrequency {
    public int maxFrequencyElements(int[] nums) {
        var max = 0;
        var count = 0;
        for (int num : nums) {
            var temp = 0;
            for (int i : nums) {
                if (num == i) {
                    temp++;
                }
            }
            if (temp > max) {
                max = temp;
                count = 1;
            } else if (temp == max) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        CountElementswithmaximumfrequency obj = new CountElementswithmaximumfrequency();
        System.out.println(obj.maxFrequencyElements(nums));
    }
}