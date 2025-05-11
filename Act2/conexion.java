package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	
	 private Connection conexion;

	    public void conectar(String baseDeDatos, String usuario, String contrasena) {
	        String url = "jdbc:mysql://localhost:3306/" + baseDeDatos;
	        try {
	            conexion = DriverManager.getConnection(url, usuario, contrasena);
	            System.out.println("Si funciona");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	 public Connection getConexion() {
	      return conexion;
	 }
}
