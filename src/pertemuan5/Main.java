package pertemuan5;

public class Main {

    public static void main(String[] args) {
        Gelas gelas1 = new Gelas("hitam");
        Gelas gelas2 = new Gelas("Biru");

        System.out.println("Sebelum tukar:");
        System.out.println("Warna g1: " + gelas1.getWarna());
        System.out.println("Warna g2: " + gelas2.getWarna());

        tukarWarnaGelas(gelas1, gelas2);

        System.out.println("Sesudah tukar:");
        System.out.println("Warna g1: " + gelas1.getWarna());
        System.out.println("Warna g2: " + gelas2.getWarna());
    }

    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
        String temp = g1.getWarna();
        g1.setWarna(g2.getWarna());
        g2.setWarna(temp);
    }
}
