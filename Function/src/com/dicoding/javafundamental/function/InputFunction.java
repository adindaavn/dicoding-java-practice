package com.dicoding.javafundamental.function;

import static com.dicoding.javafundamental.function.ReturnFunction.hitungLuas;

public class InputFunction {
    public static void main(String[] args) {
        //memanggil fungsi
        hitungLuas(7, 6.5);
    }

    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
