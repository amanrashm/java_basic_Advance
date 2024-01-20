package Arrays;
public class Unique_Number_Of_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        // Logic behind below approach
        // 1. Create an array of size 201 (100 + 100 + 1)
        // 2. Add 100 to each element of the input array
        // 3. Increment the count of each element in the input array in the new array
        // 4. Create a boolean array of size 101 (100 + 1)
        // 5. Iterate through the new array and check if the count of any element is already seen
        // 6. If yes, return false
        // 7. If no, return true
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        var count = new int[2001];
        for (var j : arr) {
            count[j + 1000]++;
        }
        var seen = new boolean[1001];
        for (var j : count) {
            if (j != 0) {
                if (seen[j]) {
                    return false;
                }
                seen[j] = true;
            }
        }
        return true;
    }
    public static void main(String... args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}