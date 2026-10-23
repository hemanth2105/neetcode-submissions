
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Get unique numbers
        List<Integer> arr = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency in descending order
        arr.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Store the first k numbers
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}
