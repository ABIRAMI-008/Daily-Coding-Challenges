class Solution {
    int totalTilt = 0;

    public int findTilt(TreeNode root) {
        calculateSum(root);
        return totalTilt;
    }

    int calculateSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = calculateSum(root.left);
        int right = calculateSum(root.right);

        totalTilt += Math.abs(left - right);

        return root.val + left + right;
    }
}