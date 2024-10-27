package world_of_recursion.house_robber2;
//213: leetcode 
public class HouseRobberCircular {
    public static void main(String[] args) {
        int[] houseMoneyArr = { 1,2,3,1 };

        System.out.println(calculateCircularMaxRob(houseMoneyArr, 0));

    }

    public static int calculateCircularMaxRob(int[] houseMoneyArr, int index) {
        // base Condition
        if (index >= houseMoneyArr.length - 1)
            return 0;

        int rob = houseMoneyArr[index] + calculateCircularMaxRob(houseMoneyArr, index + 2);
        int dontRob = calculateCircularMaxRob(houseMoneyArr, index + 1);
        return Math.max(rob, dontRob);
    }

}
