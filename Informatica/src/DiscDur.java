public class DiscDur extends Article {
    private float capacitat;

    public DiscDur(String codi, String descripcio, int unitats, float preuBase, float capacitat) {
        super(codi, descripcio, unitats, preuBase);
        this.capacitat = capacitat;
    }

    public float getCapacitat() {
        return capacitat;
    }

    public float preu() {
        return getPreuBase() * capacitat * 0.9f;
    }

    public String toString() {
        return codi + " " + descripcio + " " + unitats + " " + capacitat + "GB " + preu() + "€";
    }
}
