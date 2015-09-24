package com.zhaofukai.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 2015/9/8.
 */
public class BinaryTreeRightSideView {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ret = new ArrayList<Integer>();
            List<TreeNode> first = new ArrayList<TreeNode>();
            List<TreeNode> second = new ArrayList<TreeNode>();
            if (root == null) {
                return ret;
            }
            first.add(root);
            while(true) {
                if (first.size() == 0) {
                    break;
                }
                for (int i = 0; i < first.size(); i++) {
                    TreeNode node = first.get(i);
                    if (i == first.size() - 1) {
                        ret.add(node.val);
                    }
                    if (node.left != null) {
                        second.add(node.left);
                    }
                    if (node.right != null) {
                        second.add(node.right);
                    }
                }
                first.clear();
                first.addAll(second);
                second.clear();
            }
            return ret;
        }
    }
}
