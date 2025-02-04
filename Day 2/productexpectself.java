public class five {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int prevSuffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
        }

        return ans;
    }

    public static void main(String[] args) {
        five solution = new five();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
