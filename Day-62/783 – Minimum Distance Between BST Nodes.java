class Solution {
    Integer previous = null;
    int answer = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return answer;
    }

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (previous != null) {
            answer = Math.min(answer, root.val - previous);
        }

        previous = root.val;

        inorder(root.right);
    }
}