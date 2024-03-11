package main.difficulty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 2386. 找出数组的第 K 大和
 */
public class FindTheKSumOfArray {

    public long kSum(int[] nums, int k) {
        int n = nums.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                total += nums[i];
            } else {
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);

        long ret = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{nums[0], 0});
        for (int j = 2; j <= k; j++) {
            long[] arr = pq.poll();
            long t = 0;
            if (arr != null) {
                t = arr[0];
            }
            assert arr != null;
            int i = (int) arr[1];
            ret = t;
            if (i == n - 1) {
                continue;
            }
            pq.offer(new long[]{t + nums[i + 1], i + 1});
            pq.offer(new long[]{t - nums[i] + nums[i + 1], i + 1});
        }
        return total - ret;
    }

}
