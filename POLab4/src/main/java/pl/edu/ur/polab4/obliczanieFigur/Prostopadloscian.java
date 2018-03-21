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
public class Prostopadloscian {
           public double dlugosc;
    public double szerokosc;
    public double wysokosc;
    public double pole;
    public double obwod;
    public double objetosc;
    

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
    }

    public double pole() {
        pole = 2*szerokosc * dlugosc + 2*szerokosc*wysokosc+2*dlugosc*wysokosc;
        return pole;
    }

    public double obwod() {
        obwod = 4*(dlugosc+wysokosc+szerokosc);
        return obwod;
    }
    public double objetosc() {
        objetosc =  dlugosc*szerokosc*wysokosc;
        return obwod;
    }
    

    public void wyswietl() {
        System.out.println("Prostopadloscian o dlugosci " + dlugosc + " o szerokosc:" + szerokosc + "o wysokosci: "+ wysokosc+""
                + " o polu:" + pole +" o obwodzie: "+obwod+" o objetosci " + objetosc);
    }

}
