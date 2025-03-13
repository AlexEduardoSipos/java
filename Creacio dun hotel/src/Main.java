public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Gran Hotel", 5);

        hotel.afegirHabitacio(new Habitacio(101, "luxe", 2));
        hotel.afegirHabitacio(new Habitacio(102, "normal", 1));
        hotel.afegirHabitacio(new Habitacio(103, "superluxe", 3));

        Client client1 = new Client("Joan Puig", "12345678A", "1111-2222-3333-4444");
        Client client2 = new Client("Maria Torres", "87654321B", "5555-6666-7777-8888");

        hotel.llistarHabitacionsDisponibles();

        hotel.ferReserva(1, client1, 101, 3);
        hotel.ferReserva(2, client2, 102, 2);

        hotel.llistarHabitacionsDisponibles();

        System.out.println(client1.getNom() + " ha de pagar: " + hotel.calcularPagament(client1) + "€");
        System.out.println(client2.getNom() + " ha de pagar: " + hotel.calcularPagament(client2) + "€");
    }
}
