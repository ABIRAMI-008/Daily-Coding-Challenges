import java.util.*;

class Solution {

    List<Integer> ans = new ArrayList<>();
    int index = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        dfs(root, voyage);

        if (!ans.isEmpty() && ans.get(0) == -1) {
            return ans;
        }

        return ans;
    }

    private void dfs(TreeNode node, int[] voyage) {

        // Stop if node is null or mismatch already found
        if (node == null || (!ans.isEmpty() && ans.get(0) == -1)) {
            return;
        }

        // Current node doesn't match voyage
        if (node.val != voyage[index]) {
            ans.clear();
            ans.add(-1);
            return;
        }

        index++;

        // Need to flip
        if (node.left != null &&
            index < voyage.length &&
            node.left.val != voyage[index]) {

            ans.add(node.val);

            dfs(node.right, voyage);
            dfs(node.left, voyage);

        } else {

            dfs(node.left, voyage);
            dfs(node.right, voyage);
        }
    }
} 
