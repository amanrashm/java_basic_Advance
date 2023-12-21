package Arrays;
public class Prime_number {
    public static void main(String[] args) {
    int cnt = 0;
    int i = 0;
    int flag = 0;
    int intArr[] = {10, 11, 13, 15, 17, 19, 23, 25, 30};
    for (cnt = 0; cnt < intArr.length; cnt++) {
        flag = 0;
        for (i = 2; i < intArr[cnt] / 2; i++) {
            if (intArr[cnt] % i == 0) {
                flag = 1;
                break;
            }
        }
        System.out.printf("%3d - %s\n", intArr[cnt], (flag == 0 ? "Prime" : "Not Prime"));
    }
    System.out.println();
    }
}