/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Kuba
 */
public class Main {

    public static void main(String[] args) {

        Student[] studnet = new Student[100];
        for (int i = 0; i < 100; i++) {
            studnet[i] = new Student("", "", 0);
        }
        System.out.println("   1. wprowadzanie danych studenta pod wybrany index tablicy,\n"
                + "    2.edycję (nadpisanie danych studenta) spod wybranego indeksu,\n"
                + "  3.  usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),\n"
                + "   4. wyświetlenie obiektu o danym indeksie.\n"
                + "   5. wyświetlenie wszystkich obiektów,\n"
                + "    6.wyświetlenie zakresu obiektów w podanym zakresie.");
        int n = 1;
        Scanner odczyt = new Scanner(System.in);
        int indeks;
        switch (n) {
            case 1: {
                System.out.println("podaj indeks studenta");
                indeks = odczyt.nextInt();
                studnet[indeks].wprowadzenie();
            }
            break;
            case 2: {
                System.out.println("podaj indeks studenta");
                indeks = odczyt.nextInt();
                studnet[indeks].wprowadzenie();
            }
            break;
            case 3: {
                System.out.println("podaj indeks studenta");
                indeks = odczyt.nextInt();
                studnet[indeks].usun();
            }
            break;
            case 4: {
                System.out.println("podaj indeks studenta");
                indeks = odczyt.nextInt();
                studnet[indeks].wypisz();
            }
            break;
            case 5: {
                for (int i = 0; i < 100; i++) {
                    System.out.println("nr " + i);
                    studnet[i].wypisz();
                }
            }
            break;
            case 6: {
                System.out.println("od jakiego do jakiego nr ma byc wyswietlane? ");
                int od = odczyt.nextInt();
                int dom = odczyt.nextInt();
                for (int i = od; i < dom; i++) {
                    System.out.println("nr " + i);
                    studnet[i].wypisz();
                }
            }

        }
    }
}
