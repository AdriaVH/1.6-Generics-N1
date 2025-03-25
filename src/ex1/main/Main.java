package ex1.main;

import ex1.classes.NoGenericMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1 check");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        NoGenericMethods noGenericMethods1 = new NoGenericMethods<>(sc1, sc3, sc2);
        NoGenericMethods noGenericMethods2 = new NoGenericMethods<>(sc1, sc2, sc3);

        System.out.println(noGenericMethods1.getObject2().equals(noGenericMethods2.getObject3()));

    }
}