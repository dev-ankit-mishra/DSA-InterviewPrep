//Problem Link-https://leetcode.com/problems/3sum/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array

        int n = nums.length;

        for (int k = 0; k < n - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) continue; // Skip duplicates for k

            int i = k + 1;
            int j = n - 1;

            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[k], nums[i], nums[j]));

                    // Skip duplicates for i and j
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;

                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return ans;
    }
}
