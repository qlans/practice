package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        Solution solution = new BalancedBinaryTree().new Solution();
        System.out.println(solution.isBalanced(root));
    }

    public class Solution {

        public boolean isBalanced(TreeNode root) {
            return binaryTreeHight(root) == -1 ? false : true;
        }

        private int binaryTreeHight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int lHight = binaryTreeHight(root.left);
            if (lHight == -1) {
                return -1;
            }
            int rHight = binaryTreeHight(root.right);
            if (rHight == -1) {
                return -1;
            }
            int minus = lHight - rHight;
            if (minus > 1 || minus < -1) {
                return -1;
            }
            return (minus < 0 ? rHight : lHight) + 1;
        }
    }
}
