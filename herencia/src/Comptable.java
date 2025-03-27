public class Comptable extends EmpleatOficina {
    public Comptable(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + "finances.");
    }
}
