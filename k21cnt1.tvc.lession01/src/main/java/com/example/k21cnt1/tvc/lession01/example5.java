package com.example.k21cnt1.tvc.lession01;

import java.util.Arrays;
import java.util.List;

public class example5 {
    public static void main(String[] args) {
        List<String> list
                = Arrays.asList("Java SpringBoot","C# NetCore","PHP","JavaScript");
// Using Lambda expression
                list.forEach(item -> System.out.println(item));

        System.out.println("============");
        list.forEach(System.out::println);
    }
}