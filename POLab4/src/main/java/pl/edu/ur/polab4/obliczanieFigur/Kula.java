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
public class Kula {

    public double promien;
    public double pole;
    public double obwod;
    public double objetosc;

    public Kula(int promien) {
        this.promien = promien;

    }

    public double pole() {
        pole = PI * promien * promien * 4;
        return pole;
    }

    public double objetosc() {
        objetosc = promien * promien *promien * 1.33 * PI;
        return objetosc;
    }

    public void wyswietl() {
        System.out.println("Kula o promien " + promien + ""
                + " o polu:" + pole + " o objetosci " + objetosc);
    }

}
