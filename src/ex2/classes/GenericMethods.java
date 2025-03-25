package ex2.classes;

public class GenericMethods {

    public <T, K, V> void print (T thing1, K thing2, V thing3){
        System.out.println(thing1);
        System.out.println(thing2);
        System.out.println(thing3);
    }
}
