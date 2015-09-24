package com.zhaofukai.leetcode;

import java.util.*;

/**
 * Created by zhao on 2015/6/27.
 */
public class Anagrams {
    public static void main(String[] args) {

    }

    public List<String> anagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] charNum = new int[26];
            for (int i = 0; i < str.length(); i++) {
                charNum[str.charAt(i) - 'a']++;
            }
            StringBuilder ss = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < charNum[i]; j++) {
                    ss.append('a' + i);
                }
            }
            String sstr = ss.toString();
            if (!map.containsKey(sstr)) {
                map.put(sstr, new ArrayList<String>());
            }
            map.get(sstr).add(str);
        }
        List<String> ret = new ArrayList<String>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                ret.addAll(entry.getValue());
            }
        }
        return ret;
    }
}
