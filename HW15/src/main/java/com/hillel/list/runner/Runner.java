package com.hillel.list.runner;

import com.hillel.list.linkedlist.LinkedList;

public class Runner {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        LinkedList<Integer> list = new LinkedList<>(array);

        for (Integer in : list) {
            System.out.println(in);
        }


    }
}