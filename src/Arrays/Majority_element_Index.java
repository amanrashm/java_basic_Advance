package Arrays;
public class Majority_element_Index {
    public static int Majority_element(int [] Majority_element){
        int ansIndex = 0;
        int count = 0;
        int size = Majority_element.length;
        for (int i = 0; i < size ; i++) {
            if(Majority_element[i] == Majority_element[ansIndex]){
                count++ ;
            }else {
                count-- ;
            }
            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        return ansIndex;
    }
    public static void main(String[] args) {
        int [] n = {5,1,4,1,1};
        System.out.println(Majority_element(n));
    }
}