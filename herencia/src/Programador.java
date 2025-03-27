public class Programador extends EmpleatTecnic {
    public Programador(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + " escriu codi.");
    }
}
