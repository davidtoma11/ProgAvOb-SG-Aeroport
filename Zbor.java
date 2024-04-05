import java.util.Date;

public class Zbor {
    private int numarZbor;
    private String destinatie;
    private Date dataPlecare;
    private Date dataSosire;

    // Constructor
    public Zbor(int numarZbor, String destinatie, Date dataPlecare, Date dataSosire) {
        this.numarZbor = numarZbor;
        this.destinatie = destinatie;
        this.dataPlecare = dataPlecare;
        this.dataSosire = dataSosire;
    }

    // Getteri și setteri pentru atributele specifice
    public int getNumarZbor() {
        return numarZbor;
    }

    public void setNumarZbor(int numarZbor) {
        this.numarZbor = numarZbor;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public Date getDataPlecare() {
        return dataPlecare;
    }

    public void setDataPlecare(Date dataPlecare) {
        this.dataPlecare = dataPlecare;
    }

    public Date getDataSosire() {
        return dataSosire;
    }

    public void setDataSosire(Date dataSosire) {
        this.dataSosire = dataSosire;
    }

    // Metode specifice gestionării zborurilor
    public void afisareDetaliiZbor() {
        System.out.println("Zborul " + numarZbor + " cu destinația " + destinatie + " pleacă la " + dataPlecare + " și sosește la " + dataSosire);
    }
}
