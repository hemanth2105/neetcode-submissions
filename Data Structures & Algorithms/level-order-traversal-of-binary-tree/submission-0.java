
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> hi = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return hi;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelnum = queue.size();

            List<Integer> sub = new LinkedList<>();

            for (int i = 0; i < levelnum; i++) {
                TreeNode node = queue.poll();

                sub.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            hi.add(sub);
        }

        return hi;
    }
}
