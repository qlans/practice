package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */
public class LongestValidParentheses {

    public static void main(String[] args) {
        Solution solution = new LongestValidParentheses().new Solution();
        System.out.println(solution.longestValidParentheses(")())))("));
    }

    public class Solution {
        public int longestValidParentheses(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int ret = getMaxSubLength(s);
            int ret1 = getMaxSubLength1(s);
            return ret < ret1 ? ret1 : ret;

        }

        private int getMaxSubLength(String s) {
            int left = 0;
            int ret = 0;
            int maxSubStr = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    left++;
                } else if (s.charAt(i) == ')') {
                    if (left > 0) {
                        left--;
                        ret += 2;
                    } else {
                        left = 0;
                        ret = 0;
                    }
                    if (left == 0 && ret > 0) {
                        maxSubStr = maxSubStr < ret ? ret : maxSubStr;
                    }
                }
            }
            return maxSubStr;
        }

        private int getMaxSubLength1(String s) {
            int left = 0;
            int ret = 0;
            int maxSubStr = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ')') {
                    left++;
                } else if (s.charAt(i) == '(') {
                    if (left > 0) {
                        left--;
                        ret += 2;
                    } else {
                        left = 0;
                        ret = 0;
                    }
                    if (left == 0 && ret > 0) {
                        maxSubStr = maxSubStr < ret ? ret : maxSubStr;
                    }
                }
            }
            return maxSubStr;
        }
    }
}
