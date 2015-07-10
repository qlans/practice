package com.zhaofukai.thinkinjava.strings;

import com.zhaofukai.thinkinjava.net.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: by zhaofukai
 */
public class Test18 {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: fileName");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\".*\"");
        System.out.println(args[0] + " string literals:");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}
