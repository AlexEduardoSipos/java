public class Secretari extends EmpleatOficina {
    public Secretari(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + " esta gestionant agenda.");
    }
}
