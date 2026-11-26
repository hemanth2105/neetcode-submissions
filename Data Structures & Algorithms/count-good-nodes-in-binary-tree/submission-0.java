
class Solution {

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return good(root, root.val);
    }

    public int good(TreeNode root, int maxValue) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        if (root.val >= maxValue) {
            count = 1;
        }

        maxValue = Math.max(maxValue, root.val);

        int left = good(root.left, maxValue);
        int right = good(root.right, maxValue);

        return count + left + right;
    }
}
