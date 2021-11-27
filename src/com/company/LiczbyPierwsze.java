package com.company;

import java.util.Arrays;
/********************************************************
 * nazwa klasy: LiczbyPierwsze
 * atrybuty: ileLiczbPierwszych - ile kolejnych liczb pierwszych szukamy
 *           nalezioneLiczby - tablica odnalezionych liczb pierwszych
 * opis: klasa do wyszukiwania liczb pierwszych
 * autor: 56789012345
 * ****************************************************/
public class LiczbyPierwsze {
    private int ileLiczb;
    private int[] znalezioneLiczby;

    public LiczbyPierwsze(int ileLiczb) {
        this.ileLiczb = ileLiczb;
        this.znalezioneLiczby = new int[ileLiczb];
    }

    /********************************************************
     * nazwa funkcji: sprawdzCzyPierwsza
     * parametry wejściowe: liczba - liczba, którą sprawdzamy czy jest pierwsza
     * wartość zwracana: true - gdy liczba jest liczbą pierwszą,
     *                   false - gdy nie jest liczbą pierwszą
     * autor: 56789012345
     * ****************************************************/
    private boolean sprawdzCzyPierwsza(int liczba){
        //tu będziemy pamiętać czy liczba ni dzieli się przez jhaką inną
        boolean jestPierwsza = true;
        //w pętli i od 2 do liczba-1
        for (int i = 2; i <liczba ; i++) {
            //sprawdzamy czy liczba dzieli się przez i
            if(liczba % i ==0 ) {
                //jeżeli dzieli się bez reszty, to oznacza, że nie jest liczbą pierwszą
                jestPierwsza = false;
                //return false;
            }
        }
        return jestPierwsza;
    }

    /********************************************************
     * nazwa funkcji: znajdzNPierwszych
     * parametry wejściowe: n - ilość szukanych liczb pierwszych
     * wartość zwracana: brak
     * opis: Znajduje n kolejnych liczb pierwszyc i zapisuje je do tablicy
     * autor: 56789012345
     * ****************************************************/
     public void znajdzNPierwszych(int n){
        //w tej zmiennej będziemy liczyć odnalezione liczby pierwsze
        int ileJuzZnaleziono = 0;
        //kolejne liczby sprawdzane, czy są pierwszymi
        int kandydatNaLiczbePierwsza = 1;
        //podczas gdy nie znalezion jeszcze n liczb pierwszych
        while(ileJuzZnaleziono<n){ //wykonuj pętlę
            //sprawdzamy czy kandydat jest liczbą pierwszą
            if(sprawdzCzyPierwsza(kandydatNaLiczbePierwsza)){
                //jeżeli kandydat jest liczbą pierwszą to
                //dopisujemy ją do tablicy
                this.znalezioneLiczby[ileJuzZnaleziono] = kandydatNaLiczbePierwsza;
                //zwiększam licznik odnalezionych liczb pierwszych
                ileJuzZnaleziono ++;
            }
            //generuję kolejną liczbę do sprawdzania
            kandydatNaLiczbePierwsza ++;
        }
     }

    /********************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: znalezione liczby pierwsze oddzielone przecinkami
     * opis: Zwraca łńcuch zawierający znalezione liczby pierwsze oddzielone przecinkami
     * autor: 56789012345
     * ****************************************************/
    @Override
    public String toString() {
        return Arrays.toString(znalezioneLiczby);
    }
}
