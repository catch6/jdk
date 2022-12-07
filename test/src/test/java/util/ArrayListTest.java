package test.java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Catch
 * @since 2022-12-06
 */
public class ArrayListTest {

    @Test
    void toArray1() {
        List<String> list = Arrays.asList("a", "b");
        Object[] objects = list.toArray();
        System.out.println(objects.getClass());
    }

    @Test
    void toArray2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Object[] objects = list.toArray();
        System.out.println(objects.getClass());
    }

    @SuppressWarnings("rawtypes")
    @Test
    void clone1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ArrayList clone = (ArrayList) list.clone();
        int size = clone.size();
        System.out.println(size);
    }

    @Test
    void addAll1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        boolean b = list.addAll(new ArrayList<>());
        Assertions.assertFalse(b);
    }

    @Test
    void iterator1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }

}
