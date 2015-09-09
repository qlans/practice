package com.zhaofukai.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: by zhaofukai
 */
public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            if (root == null) {
                return ret;
            }
            List<TreeNode> first = new ArrayList<TreeNode>();
            List<TreeNode> second = new ArrayList<TreeNode>();
            first.add(root);
            while(true) {
                if (first.size() == 0) {
                    break;
                }
                List<Integer> tmp = new ArrayList<Integer>();
                for (int i = 0; i < first.size(); i++) {
                    TreeNode node = first.get(i);
                    tmp.add(node.val);
                    if (node.left != null) {
                        second.add(node.left);
                    }
                    if (node.right != null) {
                        second.add(node.right);
                    }
                }
                ret.add(tmp);
                first.clear();
                first.addAll(second);
                second.clear();
            }
            return ret;
        }
    }
}
