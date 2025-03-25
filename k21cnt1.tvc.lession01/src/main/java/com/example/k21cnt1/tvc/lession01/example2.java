package com.example.k21cnt1.tvc.lession01;

@FunctionalInterface
interface SayHellol {
    void sayHello();
}
    public class example2{
        public static void main(String[] args) {
            SayHellol sayHello = () -> {
                    System.out.println("Hello World");
            };
            sayHello.sayHello();
        }
    }