package com.example.k21cnt1.tvc.lession01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java Spring Boot", "C# NetCore", "PHP", "JavaScript");
        Collections.sort(list, (String strl1, String strl2) -> strl1.compareTo(strl2));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
