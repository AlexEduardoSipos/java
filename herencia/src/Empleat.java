public class Empleat {
    protected String nom;
    protected float salariBase;

    public Empleat(String nom, float salariBase) {
        this.nom = nom;
        this.salariBase = salariBase;
    }

    public void treballar() {
        System.out.println(nom + " esta treballant.");
    }

    public void pagarSou() {
        System.out.println(nom + " cobra " + salariBase );
    }
}
