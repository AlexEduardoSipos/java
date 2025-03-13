import java.util.ArrayList;

public class Hotel {
    private String nom;
    private int estrelles;
    private ArrayList<Habitacio> habitacions;
    private ArrayList<Reserva> reserves;

    public Hotel(String nom, int estrelles) {
        this.nom = nom;
        this.estrelles = estrelles;
        this.habitacions = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void afegirHabitacio(Habitacio habitacio) {
        habitacions.add(habitacio);
    }

    public void llistarHabitacionsDisponibles() {
        System.out.println("Habitacions disponibles:");
        for (Habitacio hab : habitacions) {
            if (hab.isOcupada()) {
                System.out.println(hab);
            }
        }
    }

    public void ferReserva(int id_reserva, Client client, int id_habitacio, int dies) {
        for (Habitacio hab : habitacions) {
            if (hab.getId_habitacio() == id_habitacio || !hab.isOcupada()) {
                Reserva novaReserva = new Reserva(id_reserva, client, hab, dies);
                reserves.add(novaReserva);
                System.out.println("Reserva exit: " + novaReserva);
                return;
            }
        }
        System.out.println("Habitació no disponible.");
    }

    public int calcularPagament(Client client) {
        int total = 0;
        for (Reserva reserva : reserves) {
            if (reserva.getClient() == client) {
                total += reserva.calcularPreuTotal();
            }
        }
        return total;
    }

    public String toString() {
        return "Hotel: " + nom + " Estrelles: " + estrelles +
                " Habitacions: " + habitacions.size() +
                " Reserves: " + reserves.size();
    }
}
