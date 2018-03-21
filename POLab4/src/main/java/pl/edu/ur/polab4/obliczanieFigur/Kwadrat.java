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
public class Kwadrat {

    public int dlugosc;

    public Kwadrat(int dlugosc) {
        this.dlugosc = dlugosc;
        System.out.println(this.dlugosc);
    }

    int pole(int dlugosc) {
        System.out.println("pole= " + dlugosc * dlugosc);
        return this.dlugosc * this.dlugosc;
    }

    int obwod(int dlugosc) {
        return 4 * this.dlugosc;
    }

}
