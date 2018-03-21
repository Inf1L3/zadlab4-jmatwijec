/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import static java.lang.Math.PI;

/**
 *
 * @author student
 */
public class Stozek {
    public double tworzaca;
    public double promien;
    public double pole;
    public double obwod;
    public double objetosc;
    public double wysokosc;
    

    public Stozek(int tworzaca, int promien, int wysokosc) {
        this.tworzaca = tworzaca;
        this.promien=promien;
        this.wysokosc=wysokosc;
    }

    public double pole() {
        pole = PI * promien *promien + promien*PI*tworzaca;
        return pole;
    }

    public double objetosc() {
        objetosc = 0.33*promien*promien*wysokosc*PI;
        return objetosc;
    }
    

    public void wyswietl() {
        System.out.println("Stozka o promien " + promien + " o tworzaca:" + tworzaca + "o wysokosci: "+ wysokosc+""
                + " o polu:" + pole +" o objetosci " + objetosc);
    }
    
}
