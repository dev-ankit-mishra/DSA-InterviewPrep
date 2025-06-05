//Problem Link-https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;
        int left = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
