import java.util.Date;

public class ZborInternțional extends Zbor {
    private String taraDestinatie;
    private String tipAvion;

    // Constructor
    public ZborInternțional(int numarZbor, String destinatie, Date dataPlecare, Date dataSosire, String taraDestinatie, String tipAvion) {
        super(numarZbor, destinatie, dataPlecare, dataSosire);
        this.taraDestinatie = taraDestinatie;
        this.tipAvion = tipAvion;
    }

    // Getteri și setteri pentru atributele specifice
    public String getTaraDestinatie() {
        return taraDestinatie;
    }

    public void setTaraDestinatie(String taraDestinatie) {
        this.taraDestinatie = taraDestinatie;
    }

    public String getTipAvion() {
        return tipAvion;
    }

    public void setTipAvion(String tipAvion) {
        this.tipAvion = tipAvion;
    }

    // Metode specifice pentru zborurile internaționale
    public void efectueazaControlVamal() {
        System.out.println("Zborul " + getNumarZbor() + " efectuează control vamal pentru țara " + taraDestinatie);
    }
}
