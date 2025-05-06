package main;

import conexion.Conexion;
import registros.GestionRegistros;

public class Main {
    public static void main(String[] args) {
        Conexion db = new Conexion();
        db.conectar("pelicules", "root", "");

        GestionRegistros gestor = new GestionRegistros(db.getConexion());

        gestor.obtenerTodosLosRegistros("pelicules");
        gestor.obtenerRegistroPorClave("clients", "id_client", "1");
    }
}
