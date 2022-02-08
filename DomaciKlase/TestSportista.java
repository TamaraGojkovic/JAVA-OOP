package DomaciKlase;

// Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove
// metoda napisanih u klasi Sportista.

public class TestSportista {

    public static void main(String[] args) {

        Sportista s1 = new Sportista("Nikola Grbic", "odbojka", "Vojvodina", 9);
        Sportista s2 = new Sportista("Aleksandar Mitrovic", "fudbal", "Partizan", 9);
        Sportista s3 = new Sportista("Filip Filipovic", "vaterpolo", "Partizan", 10);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s2.setKlub("Fulham");
        System.out.println(s2);

    }
}

