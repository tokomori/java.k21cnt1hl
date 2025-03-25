package com.example.k21cnt1.tvc.lession01;

@FunctionalInterface
interface Calculator1 {
    int add(int a, int b);
}
@FunctionalInterface
interface Calculator2{
    void add(int a, int b);
}
public class example4 {
    public static void main(String[] args) {
        Calculator1 calc1 = (int a, int b) -> (a + b);
        System.out.println(calc1.add(11, 12));
        Calculator1 calc2 = (a, b) -> (a + b);
        System.out.println(calc2.add(21, 22));
        Calculator2 calc3 = (a, b) ->
                System.out.println(a + b);
        calc3.add(31, 32);
        Calculator2 calc4 = (a, b) -> {
            int sum = a + b;
            System.out.println(a + "+" + b + "=" + sum);
        };
    }
}