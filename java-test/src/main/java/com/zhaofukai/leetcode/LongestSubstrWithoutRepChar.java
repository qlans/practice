package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */
public class LongestSubstrWithoutRepChar {
    public static void main(String[] args) {
        Solution1 solution = new LongestSubstrWithoutRepChar().new Solution1();
        System.out.println(solution.lengthOfLongestSubstring(""));
    }

    /**
     * DP
     * pos[] indicate the character last found position
     * dis[] indicate current position end longest substring
     *
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null) {
                return 0;
            }
            int[] pos = new int[95];
            int[] dis = new int[s.length() + 1];
            int ret = 0;
            for (int i = 1; i <= s.length(); i++) {
                int cur = s.charAt(i - 1) - ' ';
                int tmp = i - pos[cur];
                if (tmp > dis[i - 1]) {
                    dis[i] = dis[i - 1] + 1;
                } else {
                    dis[i] = tmp;
                }
                ret = ret < dis[i] ? dis[i] : ret;
                pos[cur] = i;
            }
            return ret;
        }
    }

    /**
     * 最大的字段总在两个相邻的字符间(或最近相邻字符)产生，所以每次将已有最优值和相邻相同字符(或最近相邻字符)比较即可
     */
    class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            if (s == null) {
                return 0;
            }
            int[] pos = new int[95];
            int ret = 0;
            for (int i = 1, j = 0; i <= s.length(); i++) {
                int cur = s.charAt(i - 1) - ' ';
                j = j < pos[cur] ? pos[cur] : j;
                ret = ret <  i - j ? i - j : ret;
                pos[cur] = i;
            }
            return ret;
        }
    }
}
