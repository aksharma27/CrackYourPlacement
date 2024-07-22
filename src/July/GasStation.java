package July;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for (int c : cost) sumCost += c;

        int sumGas = 0;
        for (int g : gas) sumGas += g;

        // check if it is possible to complete the journey :
        if (sumCost > sumGas) return -1;

        int curGas = 0;
        int startIdx = 0;

        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            if (curGas < 0) {
                startIdx = i + 1;
                curGas = 0;
            }
        }
        return startIdx;
    }
}
