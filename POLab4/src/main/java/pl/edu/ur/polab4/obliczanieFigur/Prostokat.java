/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author student
 */
public class Prostokat {

    public int dlugosc;
    public int szerokosc;
    public int pole;
    public int obwod;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc=szerokosc;
    }

    public int pole() {
        pole = szerokosc * dlugosc;
        return pole;
    }

    public int obwod() {
        obwod = 2 * dlugosc + 2 * szerokosc;
        return obwod;
    }

    public void wyswietl() {
        System.out.println("Prostokat o dlugosci " + dlugosc + " o szerokosc:" + szerokosc + " o polu:" + pole + " o obwod:" + obwod);
    }
}
