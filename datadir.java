package com.masihcoba.coba;


// mengimpor Scanner ke program
import java.util.Scanner;

public class datadir {

    public static void main(String[] args) {
        // deklarasi variabel
        String nama, nim, grade, faculty, major;


        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("~Data diri~");
        System.out.print("Nama mahasiswa : ");

        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();

        // Tampilkan outpu lagi
        System.out.print("grade: ");
        // scanner lagi
        grade = keyboard.nextLine();

        System.out.print("major: ");
        major = keyboard.nextLine();

        System.out.print("Faculty : ");
        faculty = keyboard.nextLine();

        System.out.print("nim: ");
        nim = keyboard.nextLine();

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Grade: " + grade);
        System.out.println("Major : " + major);
        System.out.println("Faculty : " + faculty );
        System.out.println("Nim: " + nim );
    }

}
