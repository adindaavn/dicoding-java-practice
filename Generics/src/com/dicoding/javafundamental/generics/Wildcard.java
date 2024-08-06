package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<String> Is = new ArrayList();
        ls.add("String 1");
        ls.add("String2");

        print(ls); //baris ini valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp); //Baris ini valid
    }

    public static void print(Collection<?> collection) {
        for (Object o : collection) { //perubahan ada di baris ini
            System.out.println(o);
        }
    }
}
