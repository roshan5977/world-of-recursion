
//198: LeetCode

//include exclude method \\\ choose dont choose method \\\ take donttake method \\\pick dontpick method
//try 0->n and n->0 as well!

//space complexity :0(n)
//time complexity :O(2 power n)
public class HouseRobber {
    public static void main(String[] args) {
        int[] amtHouseArr = { 1,2,3,1 };

        System.out.println(helper(0, amtHouseArr));
    }

    public static int helper(int index, int[] amtHouseArr) {
        // base condition...
        if (index >= amtHouseArr.length)
            return 0;
        int rob = amtHouseArr[index] + helper(index + 2, amtHouseArr);
        int dontrob = helper(index + 1, amtHouseArr);
        return Math.max(rob, dontrob);
    }
}
