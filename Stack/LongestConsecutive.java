import java.util.*;

class LongestConsecutive {
    static int longest(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int maxLen = 0;

        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
