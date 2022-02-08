package DomaciKlase;

public class TestGlumac {
    public static void main(String[] args) {

        Glumac g1 = new Glumac("Nikola", "Kojo",'m', 54, 7.9, "Srbija");
        Glumac g2 = new Glumac("Bred", "Pit", 'm', 58, 9.2, "SAD");
        Glumac g3 = new Glumac("Kejt", "Vinslet", 'z', 46, 8.3, "Velika Britanija" );
        Glumac g4 = new Glumac("Seka", "Sablic", 'z', 79, 9.6, "Srbija");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);


    }
}
