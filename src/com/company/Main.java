package com.company;

import java.util.Scanner;
/********************************************************
 * nazwa klasy: Main
 * atrybuty: ileLiczb - ile kolejnych liczb pierwszych szukamy*
 * opis: główna klasa uruchomieniowa
 * autor: 56789012345
 * ****************************************************/
public class Main {
    public static int ileLiczb;
    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - parametry uruchomieniowe
     * wartość zwracana:  brak
     * funkcja uruchamiająca aplikację
     * autor: 56789012345
     * ****************************************************/
    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Ile liczb pierwszych chcemy wyszukać: ");
        ileLiczb = daneWejsciowe.nextByte();

        LiczbyPierwsze liczbyPierwsze = new LiczbyPierwsze(ileLiczb);
        liczbyPierwsze.znajdzNPierwszych(ileLiczb);
        System.out.println("Znalezione liczby pierwsze: " + liczbyPierwsze.toString());

    }
}
