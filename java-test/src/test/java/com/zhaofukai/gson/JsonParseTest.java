package com.zhaofukai.gson;

import com.google.gson.JsonParser;
import org.junit.Test;

/**
 * @author: by zhaofukai
 */
public class JsonParseTest {

    @Test
    public void testJsonParse() {
        System.out.println(new JsonParser().parse("{}").getAsJsonObject());
        System.out.println(new JsonParser().parse("").getAsJsonObject());
    }
}
