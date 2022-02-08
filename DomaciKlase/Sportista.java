package DomaciKlase;

/*
Napisati klasu Sportista. Sportista ima
        1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
        2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
        3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
        4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
 */

public class Sportista {

    private String imePrezime;
    private String sport;
    private String klub;
    private int broj;

    public Sportista(String imePrezime, String sport, String klub, int broj) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        this.broj = broj;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBroj() {
        return broj;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime igraca je: ");
        sb.append(imePrezime);
        sb.append("\n");
        sb.append("Sport kojim se bavi: ");
        sb.append(sport);
        sb.append("\n");
        sb.append("Klub u kom igra: ");
        sb.append(klub);
        sb.append("\n");
        sb.append("Broj na dresu: ");
        sb.append(broj);
        sb.append("\n");

        return sb.toString();
    }
}
