package example.c1_oop_java_interface;

public class Person implements TestInterfaceMain {

    @Override
    public void printDefault() {
        TestInterfaceMain.super.printDefault();
        System.out.println("default - можем переопределить");
    }

    @Override
    public void print() {
        System.out.println("Без модификаторов обязаны реализовать");
    }
}
