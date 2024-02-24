package unidad8.clase;

import java.sql.*;

public class BaseDatos {

	// Rellenar con los datos de la conexión a la BBDD
	private String bd = "base";
	private String url = "jdbc:mysql://localhost:3306/" + bd + "?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String usuario = "root";
	private String password = "";

	// Objetos propios del paquete sql
	private Connection conn = null; // Objeto para la conexion
	private Statement stmt = null; // Objeto para realizar sentencias SQL
	private ResultSet rs = null; // Objeto donde se almacenan los registros devueltos de una SELECT

	public BaseDatos() {
		try {
			// Cargamos el driver de la conexion
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Creamos la conexion
			conn = DriverManager.getConnection(url, usuario, password);
		} catch (Exception e) {
			// Mostramos error si no se puede conectar (error puerto, nombre, pass ...)
			System.out.println("Error de conexión: " + e.getMessage());
		}
	}

	public void modificarDatos(String query) {
		// Metodo creado para las operaciones de INSERT, UPDATE o DELETE
		try {
			stmt = conn.prepareStatement(query);
		} catch (SQLException e) {
			System.out.println("Error en insertarDatos: " + e.getMessage());
		}
		// Variable entera que almacena el numero de registros insertados, actualizados o eliminados
		int i = 0;
		try {
			// Aplicamos la sentencia SQL
			i = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Error SQL: " + query + "\n" + e.getMessage());
		}
		System.out.println((i + " Filas actualizadas"));
	}

	public ResultSet consultaBD(String query) {
		// Metodo para almacenar en un objeto ResultSet la sentencia SELECT realizada
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Error consulta: " + e.getMessage());
		}
		return rs;
	}

	public void cerrarCons() {
		try {
			if (rs != null) {
				rs.close();
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Error stmt.close()");
		}
		cerrarBD();
	}

	public void cerrarBD() {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println("Error conn.close()");
		}
	}

}
