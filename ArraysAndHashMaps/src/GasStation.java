//Problem Link-https://leetcode.com/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            tank += diff;

            // If we run out of gas, reset start position
            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }

        return totalGas < 0 ? -1 : start;
    }
}
