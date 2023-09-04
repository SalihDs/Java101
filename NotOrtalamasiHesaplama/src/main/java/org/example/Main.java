package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double matematik, tarih, turkce, ingilizce, fizik, kimya;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextDouble();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextDouble();

        System.out.print("İngilizce notunuzu giriniz : ");
        ingilizce = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextDouble();

        String result = (matematik + tarih + turkce + ingilizce + fizik + kimya)/6 >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println("Geçme Durumunuz : " + result);
    }
}