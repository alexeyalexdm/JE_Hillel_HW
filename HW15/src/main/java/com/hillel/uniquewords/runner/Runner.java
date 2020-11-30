package com.hillel.uniquewords.runner;

import com.hillel.uniquewords.utils.FileHelper;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        FileHelper fileHelper = new FileHelper();
        fileHelper.validator("D:\\text.txt", map);

        System.out.println(map);


    }
}
