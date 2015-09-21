package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static void print(TreeNode root) {
        if (root.left != null) {
            print(root.left);
        }
        System.out.print(root.val + ", ");
        if (root.right != null) {
            print(root.right);
        }
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }
}

public class InvertBinaryTree {
}
