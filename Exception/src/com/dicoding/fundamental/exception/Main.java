package com.dicoding.fundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            //mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            //jika berhasil maka tampilan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            //jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
