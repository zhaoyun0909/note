package com.zyun.note.basics.basics;

import java.util.ArrayList;
import java.util.List;

public class OperList {

    public static void oper(List<String> list) {
        list.clear();

        list.add("b");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");

        OperList.oper(list);

        System.out.println(list.get(0)); //"b"
    }
}
