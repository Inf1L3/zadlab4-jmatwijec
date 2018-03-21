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
public class Kolo {
    public double promien;
    public double pole;
    public double obwod;
    public Kolo(int promien) {
        this.promien = promien;
    }

    public double pole() {
        pole=promien*promien*PI;
        return pole;
    }

    public double obwod() {
         obwod=2*promien*PI;
         return obwod;
    }
    public void wyswietl()
    {
        System.out.println("Kolo o promien "+promien+" o polu:"+pole+" o obwod:" + obwod);
    }


}
