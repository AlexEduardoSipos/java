public class Reserva {
    private int id_reserva;
    private Client client;
    private Habitacio habitacio;
    private int dies;

    public Reserva(int id_reserva, Client client, Habitacio habitacio, int dies) {
        this.id_reserva = id_reserva;
        this.client = client;
        this.habitacio = habitacio;
        this.dies = dies;
        this.habitacio.setOcupada(true);
    }

    public int calcularPreuTotal() {
        return habitacio.preuPerNit() * dies;
    }

    public int getIdReserva() {
        return id_reserva;
    }

    public Client getClient() {
        return client;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public int getDies() {
        return dies;
    }

    public String toString() {
        return "Reserva ID: " + id_reserva +
                " Client: " + client.getNom() +
                " Habitació: " + habitacio.getId_habitacio() +
                " Dies: " + dies +
                " Preu Total: " + calcularPreuTotal() ;
    }
}
