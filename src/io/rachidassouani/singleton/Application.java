package io.rachidassouani.singleton;

public class Application {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // true
        System.out.println(singleton1 == singleton2);

        // true
        System.out.println(singleton1.equals(singleton2));
    }
}
