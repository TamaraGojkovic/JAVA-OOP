package DomaciKlase;

// Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
// Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

public class Voznja {
    public static void main(String[] args) {

        Automobil a1 = new Automobil("Audi", "A8", 45682);
        Automobil a2 = new Automobil("Fiat", "Stilo", 766981, "Marko Markovic");
        Automobil a3 = new Automobil("Skoda", "Oktavia", 56485, "Janko Jankovic");
        Automobil a4 = new Automobil("Ford", "Fokus", 48654);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        a1.setVlasnik("Ivan Ivanovic");
        System.out.println(a1);

    }
}
