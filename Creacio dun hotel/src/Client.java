public class Client {
    private String nom;
    private String dni;
    private String targeta;

    public Client(String nom, String dni, String targeta) {
        this.nom = nom;
        this.dni = dni;
        this.targeta = targeta;
    }


    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public String getTargeta() {
        return targeta;
    }

    public String toString() {
        return "Client: " + nom + " DNI: " + dni + " Targeta: " + targeta;
    }
}
