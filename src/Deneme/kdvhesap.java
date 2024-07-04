package Deneme;

import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args){
        int kdv,kdvliUrun,urun;

        Scanner input = new Scanner(System.in);

        System.out.print("urunun kdvsiz fiyatini giriniz:");
        urun = input.nextInt();
        kdv = (int) (urun*(0.2));
        kdvliUrun = (urun + kdv);
        System.out.println("urun kdv'siz fiyati " + urun);
        System.out.println("kdv " + kdv);
        System.out.println("urunun kdvli fiyatı "+ kdvliUrun);













    }
}
