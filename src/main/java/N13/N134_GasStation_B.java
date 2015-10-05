package N13;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-04
 */

/**
 * There are N gas stations along a circular route,
 * where the amount of gas at station i is gas[i].
 * <p/>
 * You have a car with an unlimited gas tank
 * and it costs cost[i] of gas to travel from station i to its next station (i+1).
 * You begin the journey with an empty tank at one of the gas stations.
 * <p/>
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 * <p/>
 * Note:
 * The solution is guaranteed to be unique.
 */
public class N134_GasStation_B {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int idx = 0;
        for (int i = 0; i < gas.length; ++i) {
            int cur = gas[i] - cost[i];
            tank += cur;

            if (tank < 0) {
                idx = i + 1;
                tank = 0;
            }
            total += cur;
        }
        return total < 0 ? -1 : idx;
    }
}



