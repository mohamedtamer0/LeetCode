import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (store.containsKey(target - num)) {
                return new int[]{store.get(target - num) + 1, i + 1};
            }
            store.put(num, i);
        }
        return new int[]{};
    }
}