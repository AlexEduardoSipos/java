package Main;

import java.util.List;
import java.util.Scanner;

import campeon.Campeon;
import conexion.Conexion;
import repositorio.CampeonRepository;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar("lol", "root", "");

        CampeonRepository dao = new CampeonRepository(con.getConexion());

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Listar Campeones");
            System.out.println("2. Agregar Campeón");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    List<Campeon> lista = dao.listarCampeones();
                    if (lista.isEmpty()) {
                        System.out.println("No hay campeones.");
                    } else {
                        for (Campeon c : lista) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Tags (separados por coma): ");
                    String tags = sc.nextLine();
                    System.out.print("Lore: ");
                    String lore = sc.nextLine();

                    boolean agregado = dao.agregarCampeon(id, nombre, titulo, tags, lore);
                    if (agregado) {
                        System.out.println("¡Campeón agregado con éxito!");
                    } else {
                        System.out.println("Error al agregar el campeón.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
        con.cerrarConexion();
    }
}
