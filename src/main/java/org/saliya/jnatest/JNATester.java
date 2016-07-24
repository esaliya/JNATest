package org.saliya.jnatest;

public class JNATester {


    public static void main(String[] args) {
        System.out.println("hello");

        try {
            Class c = Class.forName("com.sun.jna.Platform");
            System.out.println("is c==null " + (c==null));
        } catch (ClassNotFoundException ignored) {
            System.out.println("error");
            ignored.printStackTrace();
        }

    }
}
