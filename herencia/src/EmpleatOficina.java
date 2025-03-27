public class EmpleatOficina extends Empleat {
    public EmpleatOficina(String nom, float salariBase) {
        super(nom, salariBase);
    }

    @Override
    public void treballar() {
        System.out.println(nom + " esta treballant en la oficina.");
    }
}
