import java.util.*;

class ZeroSumSubarray {
    static int countSubarrays(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;

        map.put(0, 1);

        for (int x : arr) {
            sum += x;
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
