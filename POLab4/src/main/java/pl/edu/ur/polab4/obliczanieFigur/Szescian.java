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
public class Szescian {
               public int dlugosc;
    public int pole;
    public int obwod;
    public int objetosc;
    

    public Szescian(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int pole() {
        pole = 2*dlugosc * dlugosc + 2*dlugosc*dlugosc+2*dlugosc*dlugosc;
        return pole;
    }

    public int obwod() {
        obwod = 4*(dlugosc+dlugosc+dlugosc);
        return obwod;
    }
    public int objetosc() {
        objetosc =  dlugosc*dlugosc*dlugosc;
        return obwod;
    }
    

    public void wyswietl() {
        System.out.println("szescian o dlugosci " + dlugosc + " o szerokosc:" + dlugosc + "o wysokosci: "+ dlugosc+""
                + " o polu:" + pole +" o obwodzie: "+obwod+" o objetosci " + objetosc);
    }
    
}
