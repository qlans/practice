package com.zhaofukai.thinkinjava.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: by zhaofukai
 */
public class Test10 {
    public static void main(String[] args) {
        String content = "Java now has regular expressions";
        String[] regex = {"^Java", "\\Breg.*", "n.w\\s_h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};
        for (String s : regex) {
            System.out.println("regex: " + s);
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println("match: " + matcher.group() + ", range: " + matcher.start() + "-" + matcher.end());
            }
        }
    }
}
