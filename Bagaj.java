public class Bagaj {
    private int numarBagaj;
    private double greutate;
    private String proprietar;

    // Constructor
    public Bagaj(int numarBagaj, double greutate, String proprietar) {
        this.numarBagaj = numarBagaj;
        this.greutate = greutate;
        this.proprietar = proprietar;
    }

    // Getteri și setteri pentru atributele specifice
    public int getNumarBagaj() {
        return numarBagaj;
    }

    public void setNumarBagaj(int numarBagaj) {
        this.numarBagaj = numarBagaj;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

    // Metode pentru gestionarea bagajelor
    public void afisareDetaliiBagaj() {
        System.out.println("Bagajul " + numarBagaj + " aparține lui " + proprietar + " și are o greutate de " + greutate + " kg.");
    }

    public void efectueazaCheckIn() {
        System.out.println("Bagajul " + numarBagaj + " a fost înregistrat la check-in.");
    }

    public void efectueazaScanareSecuritate() {
        System.out.println("Bagajul " + numarBagaj + " a fost scanat pentru securitate.");
    }
}
