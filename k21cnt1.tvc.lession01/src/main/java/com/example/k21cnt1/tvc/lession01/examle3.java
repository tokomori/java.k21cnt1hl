package com.example.k21cnt1.tvc.lession01;
@FunctionalInterface
interface SayHello2{
    public void sayHello(String name);
}
public class examle3 {
        public static void main(String[] args) {
// Lambda sử dụng 1 tham số
            SayHello2 sayl = (name) -> {
                System.out.println("Hello " + name);
            };
            sayl.sayHello("Toai");

// Ngắn gọn
            SayHello2 say2 = name -> {
                System.out.println("Hello " + name);
            };
            say2.sayHello("Nguyen Toai");

// Ngắn gọn hơn
            SayHello2 say3 = name -> System.out.println("Hello " + name);
            say3.sayHello("Toainopro");
        }
    }
