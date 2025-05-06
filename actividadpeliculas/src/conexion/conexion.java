package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conexion;

	public void conectar(String bd, String usuario, String clave) {
		String url = "jdbc:mysql://localhost:3306/" + bd;
		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conectado a la base de datos.");
		} catch (SQLException e) {
			System.out.println("No se pudo conectar: " + e.getMessage());
		}
	}

	public Connection getConexion() {
		return conexion;
	}
}
