package ex1.main;

import ex1.classes.NoGenericMethods;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1 check");

        NoGenericMethods noGenericMethods1 = new NoGenericMethods("aaa", "bbb", "ccc");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("ccc", "aaa", "bbb");


    }
}