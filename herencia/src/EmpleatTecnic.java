public class EmpleatTecnic extends Empleat {
    public EmpleatTecnic(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + " treballa en tasques tecniques.");
    }
}
