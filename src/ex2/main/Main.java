package ex2.main;


import ex2.classes.GenericMethods;
import ex2.classes.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex2 check");
        Persona persona1 = new Persona("Pepita", "Pascual" , 45);
        Persona persona2 = new Persona("Manuela", "Pascual" , 30);
        Persona persona3 = new Persona("Pancho", "Pascual" , 25);

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.print(persona1, "hola", 45);
    }
}