/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Jaka chcesz wybrac figure?"
                + "1. Kwadrat "
                + "2. Prostokat "
                + "3.Prostopadloscian "
                + "4. Szescian "
                + "5.Stozek "
                + "6. Kula "
                + "7. Kolo");
        Scanner odczyt = new Scanner(System.in);
        int wybor = odczyt.nextInt();
        switch (wybor) {
            case 1: {
                System.out.println("Podaj dlugosc kwadratu");
                int a = odczyt.nextInt();
                Kwadrat kwadrat = new Kwadrat(a);
                System.out.println(kwadrat.obwod());
                System.out.println(kwadrat.pole());
                kwadrat.wyswietl();
            }
            break;
            case 2: {
                System.out.println("Podaj dlugosc i szerokosc");
                int a = odczyt.nextInt();
                int b = odczyt.nextInt();
                Prostokat prostokat = new Prostokat(a, b);
                System.out.println(prostokat.obwod());
                System.out.println(prostokat.pole());
                prostokat.wyswietl();
            }
            break;
            case 3: {

                System.out.println("Podaj dlugosc szerokosc i wysokosc");
                int a = odczyt.nextInt();
                int b = odczyt.nextInt();
                int c = odczyt.nextInt();
                Prostopadloscian prostopadloscian = new Prostopadloscian(a, b, c);
                System.out.println(prostopadloscian.obwod());
                System.out.println(prostopadloscian.pole());
                System.out.println(prostopadloscian.objetosc());
                prostopadloscian.wyswietl();
            }
            break;
            case 4: {
                System.out.println("Podaj dlugosc szescianu");
                int a = odczyt.nextInt();
                Szescian szescian = new Szescian(a);
                System.out.println(szescian.obwod());
                System.out.println(szescian.pole());
                System.out.println(szescian.objetosc());
                szescian.wyswietl();
            }
            break;
            case 5: {
                System.out.println("Podaj tworzaca promien i wyskosc");
                int a = odczyt.nextInt();
                int b = odczyt.nextInt();
                int c = odczyt.nextInt();
                Stozek stozek = new Stozek(a, b, c);
                System.out.println(stozek.pole());
                System.out.println(stozek.objetosc());
                stozek.wyswietl();
            }
            break;
            case 6: {
                System.out.println("Podaj promien kuli");
                int a = odczyt.nextInt();
                Kula kula = new Kula(a);
                System.out.println(kula.pole());
                System.out.println(kula.objetosc());
                kula.wyswietl();
            }
            break;
            case 7: {
                System.out.println("Podaj promien");
                int a = odczyt.nextInt();
                Kolo kolo = new Kolo(a);
                System.out.println(kolo.pole());
                System.out.println(kolo.obwod());
                kolo.wyswietl();
            }
            break;
        }
    }
}
