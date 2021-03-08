package com.masihcoba.coba;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args){
        char x;
        Scanner input = new Scanner(System.in);

        System.out.println("\n>>Menentukan Huruf Vokal atau Konsonan<<\n");
        System.out.print("Masukkan Huruf : ");
        x = input.next().charAt(0);

        if(x=='a'|| x=='i'|| x=='u'|| x=='e'|| x=='o'){
            System.out.println("\n"+ x + " adalah Huruf Vokal");
        }
        else{
            System.out. println("\n"+ x + " adalah Huruf Konsonan");
        }
    }
}
