public class Utilizator {
    private String nume;
    private String prenume;
    private String email;
    private String parola;

    // Constructor
    public Utilizator(String nume, String prenume, String email, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
        inregistrare();
    }

    // Metoda pentru afisarea inregistrarii
    private void inregistrare() {
        System.out.println("Utilizatorul " + nume + " " + prenume + " a fost înregistrat cu succes.");
    }


    // Getteri și setteri
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    // Metoda pentru autentificare
    public boolean autentificare(String email, String parolaIntrodusa) {
        if (this.email.equals(email) && this.parola.equals(parolaIntrodusa)) {
            System.out.println("Autentificare a fost realizat cu suuces" + email);
            return true;
        } else {
            System.out.println("Email sau parola introdusa gresit " + email);
            return false;
        }
    }
}

