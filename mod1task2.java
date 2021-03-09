package com.masihcoba.coba;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        String innim;

        System.out.println("\n=Input NIM=");
        System.out.println("*panjang nim harus 15 yak");

        while(true) {
            System.out.print("\nMasukkan Nim : ");
            innim =(STDIN_SCANNER.next());
            if(Integer.compareUnsigned(innim.length(), 20) > 0) {
            }
            else if(Integer.compareUnsigned(innim.length(), 16) >= 0) {
                System.out.println("Terlalu panjang :)");
            }
            else if(Integer.compareUnsigned(innim.length(), 14) > 0) {
                System.out.println("Yeay nim anda : " + innim);
                break;
            }
            else {
                System.out.println("nim kurang panjang:( ");
            }
        }
    }

    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
