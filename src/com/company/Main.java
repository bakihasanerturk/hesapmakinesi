package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nr1,nr2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        nr1 = input.nextInt();

        System.out.print("İkinci Sayıyı Firiniz : ");
        nr2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-çarpma\n4-Bölme");
        System.out.print("Lütfen Seçiminizi Yapınız : ");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.println("Sonuç : " + (nr1+nr2));
                break;
            case 2:
                System.out.println("Sonuç : " + (nr1-nr2));
                break;
            case 3:
                System.out.println("Sonuç : " + (nr1*nr2));
                break;
            case 4:
                System.out.println("Sonuç : " + (nr1/nr2));
                break;
            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız");

        }
    }
}
