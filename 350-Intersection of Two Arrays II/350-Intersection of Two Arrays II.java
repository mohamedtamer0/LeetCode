public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                arr.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] res = new int[arr.size()];
        int k = 0;
        for (Integer num : arr) {
            res[k++] = num;
        }
        return res;
    }
}