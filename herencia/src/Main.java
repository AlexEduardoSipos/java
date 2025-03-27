public class Main {
    public static void main(String[] args) {
        Empleat empOficina = new EmpleatOficina("Anna", 2000);
        Empleat empSecretari = new Secretari("Laura", 2100);
        Empleat empComptable = new Comptable("Joan", 2300);
        Empleat empProgramador = new Programador("Marc", 2500);
        Empleat empAdministrador = new Administrador("Jordi", 2700);

        empOficina.treballar();
        empSecretari.treballar();
        empComptable.treballar();
        empProgramador.treballar();
        empAdministrador.treballar();

        empProgramador.pagarSou();
    }
}
