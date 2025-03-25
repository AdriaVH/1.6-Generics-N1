package ex1.classes;

public class NoGenericMethods {
    private String string1;
    private String string2;
    private String string3;

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getObject2() {
        return string2;
    }

    public void setObject2(String object2) {
        this.string2 = object2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public NoGenericMethods(String object1, String object2, String object3) {
        this.string1 = object1;
        this.string2 = object2;
        this.string3 = object3;
    }
}
