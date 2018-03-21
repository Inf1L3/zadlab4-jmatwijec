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
    public int pole;
    public int obwod;
    public Kwadrat(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int pole() {
        pole=dlugosc*dlugosc;
        return pole;
    }

    public int obwod() {
         obwod=4*dlugosc;
         return obwod;
    }
    public void wyswietl()
    {
        System.out.println("Kwadrat o dlugosci "+dlugosc+" o polu:"+pole+" o obwod:" + obwod);
    }

}
