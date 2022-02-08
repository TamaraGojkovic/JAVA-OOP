package DomaciKlase;

import java.util.ArrayList;

public class SportArray {
    public static void main(String[] args) {

        ArrayList<String> sport = new ArrayList<>();
        sport.add("Odbojka");
        sport.add("Kosarka");
        sport.add("Vaterpolo");
        sport.add("Fudbal");
        sport.add("Skokovi u vodu");
        sport.add("Klizanje");
        sport.add("Atletika");
        System.out.println(sport);


        System.out.println("Treci element iz liste je: " + sport.get(2));

        sport.set(0,"Bilijar");
        System.out.println("Menjam naziv prvog elementa u : " + sport.get(0));

        System.out.println("Uklanjam 5 element iz niza");
        sport.remove(4);
        System.out.println(sport);


        System.out.println("Velicina liste je: " + sport.size());

        System.out.println(" ");
        System.out.println("Elementi ove liste su: ");

        // Prvi nacin
        for (int i = 0; i < sport.size(); i++) {
            String element = sport.get(i);
            System.out.println((i+1) + " " + element);
        }

        System.out.println("\n");

        System.out.println("Ispis drugi nacin: ");

        // Drugi nacin
        int i = 0;
        for (String element : sport){
            i++;
            System.out.println(i + " " + element);
        }

    }
}
