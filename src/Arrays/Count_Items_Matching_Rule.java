package Arrays;
import java.util.List;
public class Count_Items_Matching_Rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        var count = 0;
        for (var item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue))
                count++;
            else if (ruleKey.equals("color") && item.get(1).equals(ruleValue))
                count++;
            else if (ruleKey.equals("name") && item.get(2).equals(ruleValue))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        var items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));
        var ruleKey = "color";
        var ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}