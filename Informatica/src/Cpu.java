public class Cpu extends Article {
    private float velocitat;

    public Cpu(String codi, String descripcio, int unitats, float preuBase, float velocitat) {
        this.codi = codi;
        this.descripcio = descripcio;
        this.unitats = unitats;
        this.preuBase = preuBase;
        this.velocitat = velocitat;
    }

    public float getVelocitat() {
        return velocitat;
    }

    public float preu() {
        return preuBase * velocitat;
    }

    public String toString() {
        return codi + " " + descripcio + " " + unitats + " " + velocitat + " " + preu();
    }

}
