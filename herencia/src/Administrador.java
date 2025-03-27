public class Administrador extends EmpleatTecnic {
    public Administrador(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + " gestiona.");
    }
}
