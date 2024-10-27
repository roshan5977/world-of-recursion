package world_of_recursion.min_cost_climbing_stairs;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        // int[] arrCostStairs = { 10, 15, 20 };
        int[] arrCostStairs = { 1,100,1,1,1,100,1,1,100,1};

        System.out.println(Math.min(minCostStairs(arrCostStairs, 0), minCostStairs(arrCostStairs, 1)));
    }

    public static int minCostStairs(int[] arrCostStairs, int index) {
        // base condition
        if (index >= arrCostStairs.length) {
            return 0;
        }
        return arrCostStairs[index]
                + Math.min(minCostStairs(arrCostStairs, index + 1), minCostStairs(arrCostStairs, index + 2));

    }

}
