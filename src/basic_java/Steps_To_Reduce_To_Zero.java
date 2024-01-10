package basic_java;
public class Steps_To_Reduce_To_Zero {
    public static int numberOfSteps(int num) {
        var stepsCount = 0;
        var i = num;
        if(num == 0) return 0;
        for(; i > 0; i /= 2){
            if((num & 1) == 0){
                stepsCount++;
                num /= 2;
            }
            else {
                stepsCount += 2;
                num /= 2;
            }
        }
        return stepsCount -1;
    }
    public static void main(String... args) {
        System.out.println(numberOfSteps(123));
    }
}