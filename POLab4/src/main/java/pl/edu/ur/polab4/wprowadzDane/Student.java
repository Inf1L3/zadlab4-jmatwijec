/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student {

    public String imie;      //
    public String nazwisko;  // Pola klasy osoba
    public int wiek;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public void setNazwa_specjalności(String nazwa_specjalności) {
        this.nazwa_specjalności = nazwa_specjalności;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }
    public int nr_indeksu;
    public String nazwa_specjalności;
    public int rok_studiow;

    public Student() {

    }

    public Student(String imie) {
        this.imie = imie;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Student(String imie, String nazwisko, int wiek, int nr_indeksu, String nazwa_specjalności, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalności = nazwa_specjalności;
        this.rok_studiow = rok_studiow;

    }

    public void wypisz() {
        System.out.println("" + this.imie + " " + this.nazwisko + " " + this.wiek + " " + this.nr_indeksu + " " + this.nazwa_specjalności + " " + this.rok_studiow);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public String getNazwa_specjalności() {
        return nazwa_specjalności;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void wprowadzenie() {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Imie?: ");
        imie = odczyt.next();
        System.out.println("nazwisko?: ");
        nazwisko = odczyt.next();
        System.out.println("wiek?: ");
        wiek = odczyt.nextInt();
    }

    public void usun() {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }
}
