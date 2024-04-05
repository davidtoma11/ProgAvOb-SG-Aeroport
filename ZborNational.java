import java.util.Date;

public class ZborNațional extends Zbor {
    private String aeroportDestinatie;

    // Constructor
    public ZborNațional(int numarZbor, String destinatie, Date dataPlecare, Date dataSosire, String aeroportDestinatie) {
        super(numarZbor, destinatie, dataPlecare, dataSosire);
        this.aeroportDestinatie = aeroportDestinatie;
    }

    // Getteri și setteri pentru atributele specifice
    public String getAeroportDestinatie() {
        return aeroportDestinatie;
    }

    public void setAeroportDestinatie(String aeroportDestinatie) {
        this.aeroportDestinatie = aeroportDestinatie;
    }

    // Metode specifice pentru zborurile naționale
    public void efectueazaVerificariSigureta() {
        System.out.println("Zborul " + getNumarZbor() + " efectuează verificări de securitate la aeroportul " + aeroportDestinatie);
    }
}
