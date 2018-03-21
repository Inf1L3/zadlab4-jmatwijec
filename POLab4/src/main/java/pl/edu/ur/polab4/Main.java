package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student pierwszy = new Student("jan");
        Student drugi = new Student("jan", "kowalski");
        Student trzeci = new Student("jan", "kowalski", 15);
        Student czwarty = new Student("jan", "kowalski", 15, 11, "rzucanie balonem", 3);
        pierwszy.wypisz();
        drugi.wypisz();
        trzeci.wypisz();
        czwarty.wypisz();
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie =odczyt.next();   //
        System.out.println("Podaj nazwisko: ");
        String nazwisko=odczyt.next();
        System.out.println("Podaj wiek: ");// Pola klasy osoba
        int wiek=odczyt.nextInt();
        System.out.println("Podaj nr_indeksu: ");
        int nr_indeksu=odczyt.nextInt();
        System.out.println("Podaj nazwa_specjalności: ");
        String nazwa_specjalności=odczyt.next();
        System.out.println("Podaj rok studiow: ");
        int rok_studiow= odczyt.nextInt();
        Student piaty= new Student(imie,nazwisko,wiek,nr_indeksu,nazwa_specjalności,rok_studiow);

    }

}
