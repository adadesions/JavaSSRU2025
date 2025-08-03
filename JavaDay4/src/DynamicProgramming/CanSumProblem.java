package DynamicProgramming;

public class CanSumProblem {
    public static boolean canSum(int targetSum, int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;

        for (int i = 0; i <= targetSum; i++) {
            if (table[i]) {
                System.out.print(i + "-->");
                for (int num : nums) {
                    if (i + num <= targetSum) {
                        table[i + num] = true;
                    }
                }
            }
        }

        System.out.println(targetSum);

        return table[targetSum];
    }

}
