package test.java.util;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Catch
 * @since 2022-12-05
 */
class HashMapTest {

    @Test
    void put() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
    }

}
