package com.gregory.cursojava.aula40;

public class Test2 {

    public static void main(String[] args) {

        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        String s3 = (String) obj3;

        Object obj4 = obterInt();
        String s4 = (String) obj4;
    }

    public static String obterString() {
        return "Minha String";
    }

    public static int obterInt() {
        return 1;
    }

}