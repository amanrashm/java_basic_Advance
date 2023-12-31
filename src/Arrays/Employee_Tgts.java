package Arrays;
public class Employee_Tgts {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        var count = 0;
        for (var i = 0; i < hours.length; i++) {
            if(hours[i] >= target)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}