package DomaciKlase;

// Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
// pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
// i da li je iz Srbije odgovorite preko booleana. Sve potrebno za glumca i glumicu da budu dva ispisa

public class Glumac {

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private String poreklo;

    private boolean zemlja () {
        if (poreklo.equals("Srbija")) {
            return true;
        } else {
            return false;
        }
    }

    public Glumac(String ime, String prezime, char pol, int godine, double ocena, String poreklo) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.poreklo = poreklo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getPoreklo() {
        return poreklo;
    }

    public void setPoreklo(String poreklo) {
        this.poreklo = poreklo;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("Ime glumca: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime glumca: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Pol glumca: ");
        sb.append(pol);
        sb.append("\n");

        sb.append("Godine starosti: ");
        sb.append(godine);
        sb.append("\n");

        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");

        sb.append("Zemlja porekla: ");
        if (zemlja() == true){
            sb.append("Glumac/glumica je poreklom iz Srbije.");
            sb.append("\n");
        } else {
            sb.append("Glumac/glumica nije poreklom iz Srbije");
            sb.append("\n");
        }

        return sb.toString();
    }












    }
