package test.java.util.concurrent;

import org.junit.jupiter.api.Test;

/**
 * @author Catch
 * @since 2022-12-07
 */
public class ConcurrentHashMapTest {

    @Test
    void abs1() {
        // abs仅仅是判断是否大于0,大于0则在前面加负号,当最小负数(-1 << 31)前面加负号时,
        // 因为正整数中没有32位去对应这个最小负数,因此还是返回负数
        int abs = Math.abs(-1 << 31);
        System.out.println(abs);
    }

}
