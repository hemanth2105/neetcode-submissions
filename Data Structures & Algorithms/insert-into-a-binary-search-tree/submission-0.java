class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        return ins(root, val);
    }

    public TreeNode ins(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = ins(root.left, val);
        }
        else if (root.val < val) {
            root.right = ins(root.right, val);
        }

        return root;
    }
}