package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import campeon.Campeon;

public class CampeonRepository {

    private Connection conexion;

    public CampeonRepository(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Campeon> listarCampeones() {
        List<Campeon> campeones = new ArrayList<>();
        String query = "SELECT * FROM campeones"; // Asegúrate de que la tabla sea la correcta

        try (PreparedStatement stmt = conexion.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Campeon campeon = new Campeon(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getString("titulo"),
                        rs.getString("tags"),
                        rs.getString("lore")
                );
                campeones.add(campeon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return campeones;
    }

    public List<Campeon> buscarCampeon(String criterio) {
        List<Campeon> campeones = new ArrayList<>();
        String query = "SELECT * FROM campeones WHERE id LIKE ? OR nombre LIKE ?"; // Asegúrate de que los campos sean correctos

        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, "%" + criterio + "%");
            stmt.setString(2, "%" + criterio + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Campeon campeon = new Campeon(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getString("titulo"),
                        rs.getString("tags"),
                        rs.getString("lore")
                );
                campeones.add(campeon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return campeones;
    }

    public boolean agregarCampeon(String id, String nombre, String titulo, String tags, String lore) {
        String query = "INSERT INTO campeones (id, nombre, titulo, tags, lore) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.setString(2, nombre);
            stmt.setString(3, titulo);
            stmt.setString(4, tags);
            stmt.setString(5, lore);

            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
