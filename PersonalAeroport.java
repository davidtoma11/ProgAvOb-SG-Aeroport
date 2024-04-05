public class Pasager extends Utilizator {
    private String numarPasaport;
    private String dataNastere;

    // Constructor
    public Pasager(String nume, String prenume, String email, String parola, String numarPasaport, String dataNastere) {
        super(nume, prenume, email, parola);
        this.numarPasaport = numarPasaport;
        this.dataNastere = dataNastere;
    }

    // Getteri și setteri pentru atributele specifice
    public String getNumarPasaport() {
        return numarPasaport;
    }

    public void setNumarPasaport(String numarPasaport) {
        this.numarPasaport = numarPasaport;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    // Metode specifice pentru pasageri
    public void rezervaBilet() {
        System.out.println("Pasagerul " + getNume() + " " + getPrenume() + " a rezervat un bilet.");
    }

    // Metoda de suprascriere a metodei de înregistrare pentru a include mesajul specific
    @Override
    public void inregistrare() {
        super.inregistrare();
        System.out.println("Acesta este un pasager.");
    }
}
