package com.four.myblog.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/4 20:44
 */
public class WordUtil {
    private static List<String> list = new ArrayList<>();

    public static List<String> getList() {
        return list;
    }

    public static List<String> addList(String name) {
        list.add(name);
        return list;
    }

    static {
        list.add("妈的");
        list.add("sb");
    }
}
