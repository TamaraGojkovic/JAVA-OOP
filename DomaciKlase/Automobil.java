package DomaciKlase;

// Napisati klasu Automobil. Automobil ima
// 1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi; (= ima geter al ne i seter)
// 2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
// 3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
// Automobil moze (= ali ne mora,znaci 2 konstruktora) da ima 4)vlasnika koji moze da se dohvati i postavi u svakom trenutku.

public class Automobil {

    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Marka: ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model: ");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj: ");
        sb.append(serijskiBroj);
        sb.append("\n");
        sb.append("Vlasnik: ");

        if (vlasnik == null){
            sb.append("Automobil nema vlasnika.");
            sb.append("\n");
        }
        else {
            sb.append(vlasnik);
            sb.append ("\n");
        }
        return sb.toString();
    }
}
