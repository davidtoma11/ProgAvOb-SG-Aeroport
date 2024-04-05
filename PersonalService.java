import java.util.ArrayList;
import java.util.List;

public class PersonalService {
    private List<Utilizator> utilizatori;
    private List<Zbor> zboruri;
    private List<PersonalAeroportuar> personalAeroportuar;

    // Constructor
    public PersonalService() {
        utilizatori = new ArrayList<>();
        zboruri = new ArrayList<>();
        personalAeroportuar = new ArrayList<>();
    }

    public void adaugaUtilizator(Utilizator utilizator) {
        utilizatori.add(utilizator);
        System.out.println("Utilizator adăugat cu succes.");
    }

    public void stergeUtilizator(Utilizator utilizator) {
        utilizatori.remove(utilizator);
        System.out.println("Utilizator șters cu succes.");
    }

    public void adaugaZbor(Zbor zbor) {
        zboruri.add(zbor);
        System.out.println("Zbor adăugat cu succes.");
    }

    public void stergeZbor(Zbor zbor) {
        zboruri.remove(zbor);
        System.out.println("Zbor șters cu succes.");
    }

    public void adaugaPersonalAeroportuar(PersonalAeroportuar personal) {
        personalAeroportuar.add(personal);
        System.out.println("Personal aeroportuar adăugat cu succes.");
    }

    public void stergePersonalAeroportuar(PersonalAeroportuar personal) {
        personalAeroportuar.remove(personal);
        System.out.println("Personal aeroportuar șters cu succes.");
    }

    public void afiseazaToateZborurile() {
        System.out.println("Lista zborurilor:");
        for (Zbor z : zboruri) {
            System.out.println("Număr zbor: " + z.getNumarZbor() + ", Destinație: " + z.getDestinatie());
        }
    }
    
    public void afiseazaTotPersonalulAeroportuar() {
        System.out.println("Lista personalului aeroportuar:");
        for (PersonalAeroportuar pa : personalAeroportuar) {
            System.out.println("Nume: " + pa.getNume() + ", Funcție: " + pa.getFunctie());
        }
    }

}
