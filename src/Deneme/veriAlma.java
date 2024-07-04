package Deneme;

import java.util.Scanner;

public class veriAlma {
    public static void main(String[] args){
        int olasilik,sElektronik,otomata,Sistemp,Gomulu,simulasyon ;
        float ort;
        Scanner input = new Scanner(System.in);

        System.out.println("olasilik notunu giriniz:");
        olasilik = input.nextInt();

        System.out.println("sElektronik notunu giriniz:");
        sElektronik = input.nextInt();

        System.out.println("otomata  notunu giriniz:");
        otomata = input.nextInt();

        System.out.println("Sistemp notunu giriniz:");
        Sistemp = input.nextInt();

        System.out.println("Gomulu notunu giriniz:");
        Gomulu = input.nextInt();

        System.out.println("simulasyon notunu giriniz:");
        simulasyon = input.nextInt();

        ort = (olasilik*4 +sElektronik*4 +otomata*7+ Sistemp*6 + Gomulu*5 + simulasyon*7)/33;

        System.out.print("tum derslerin ortalamasi : " + ort);


    }
}
