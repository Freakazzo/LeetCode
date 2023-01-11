public class IsBalanced {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null)  return true;
            int left = isBal(root.left);
            int right = isBal(root.right);
            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int isBal(TreeNode root) {
            if (root == null) { return 0; }
            return Math.max(isBal(root.left), isBal(root.right)) + 1;
        }
    }
}
