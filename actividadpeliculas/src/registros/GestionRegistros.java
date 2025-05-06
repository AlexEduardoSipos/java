package registros;

import java.sql.*;

public class GestionRegistros {
    private Connection conexion;

    public GestionRegistros(Connection conexion) {
        this.conexion = conexion;
    }

    public void mostrar(String sql) {
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            int columnas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnas; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
