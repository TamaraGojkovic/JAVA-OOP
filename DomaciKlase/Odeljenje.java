package DomaciKlase;

import java.util.ArrayList;

/*
Napisati klasu Odeljenje koja ima sledeca polja:
        - String oznaka
        - ArrayList dnevnik
        Napisati 2 konstruktora, opet na isti nacin.
        Napisati gettere i settere za sva polja.
 */

public class Odeljenje {

        private String oznaka;
        private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }


    // apsolutno nemam ideju kako dalje da uradim zadatak

    }
