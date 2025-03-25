package ex2.classes;

public class Persona {
    private String name;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Persona{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Persona(String name, String lastName, int age) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
    }
}
