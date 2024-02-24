package unidad8.clase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.mariadb.jdbc.Connection;

public class PruebaBBDD {

	public static void main(String[] args) {

		// Datos de la conexión a la BBDD
		String bd = "base";
		String url = "jdbc:mariadb://localhost:3306/" + bd;
		String usuario = "root";
		String password = "";

		ArrayList<String> lista = new ArrayList<String>();

		lista.add(((int)((Math.random()*100000000)+1)) + "Z,Luisa Fernandez,661243103,lfernan@eterprise.com,1234.56");
		lista.add(((int)((Math.random()*100000000)+1)) + "Z,Jose Lopez,661243103,jlopez@eterprise.com,1211.56");
		lista.add(((int)((Math.random()*100000000)+1)) + "Z,Pepe Rodriguez,661243103,peprodrig@eterprise.com,1268.93");

		try {
			// Cargamos el driver de la conexión
			Class.forName("org.mariadb.jdbc.Driver");

			// Creamos la conexión
			Connection con = (Connection) DriverManager.getConnection(url, usuario, password); // Objeto para la conexión

			// Almacena en un objeto ResultSet la sentencia realizada
			org.mariadb.jdbc.Statement stmt = con.createStatement(); // Objeto para realizar sentencias SQL

			querySelect(stmt);
			System.out.println();

			// queryDelete(stmt);
			// System.out.println();

			// queryInsert(stmt);
			// System.out.println();

			// Establecemos el autoCommit a false para que los cambios no se guarden automaticamente
			con.setAutoCommit(false);

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO vendedores VALUES(?,?,?,?,?)");

			for (String v : lista) {
				pstmt.setString(1, v.split(",")[0]); // DNI en la primara ?
				pstmt.setString(2, v.split(",")[1]); // Nombre
				pstmt.setInt(3, Integer.parseInt(v.split(",")[2])); // Telefono
				pstmt.setString(4, v.split(",")[3]); // Correo electronico
				pstmt.setFloat(5, Float.parseFloat(v.split(",")[4])); // Ventas

				pstmt.executeUpdate();
			}

			// Aceptamos los cambios en la conexión
			con.commit();

			con.close();
		} catch (ClassNotFoundException exc) {
			System.out.println("Error en el driver");
		} catch (SQLException exc) {
			// Mostramos error si no se puede conectar
			System.out.println("Error en la conexión: " + exc.getMessage());
		}

	}

	public static void querySelect(org.mariadb.jdbc.Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM vendedores"); // Objeto donde se almacenan los registros devueltos de una sentencia

		while (rs.next()) {
			System.out.println("Datos del vendedor/a:" + "\n  DNI: " + rs.getString("dni") + "\n  Nombre: " + rs.getString("nombre") + "\n  Telefono: " + rs.getString("telefono") + "\n  Email: " + rs.getString("email") + "\n  Ventas: " + rs.getString("ventas") + "\n  Vacaciones: " + ((rs.getFloat("ventas") > 2000) ? "Extra" : "No extra"));
		}
	}

	public static void queryDelete(org.mariadb.jdbc.Statement stmt) throws SQLException {
		String sql = "DELETE FROM vendedores WHERE nombre LIKE 'David%'"; // Query de delete
		int numRegistros = stmt.executeUpdate(sql);

		if(numRegistros > 0) {
			System.out.println(numRegistros + " eliminados");
		} else {
			System.out.println("No se han eliminado registros");
		}
	}

	public static void queryInsert(org.mariadb.jdbc.Statement stmt) throws SQLException {
		String sql = "INSERT INTO vendedores VALUES('12345677T', 'Victor Garcia', 666155123, 'correo@yahoo.es', 2345.45), ('22222123E', 'David Guapo', 666155143, 'correo2@yahoo.es', 2215.45)";
		int numRegistros = stmt.executeUpdate(sql);

		if(numRegistros > 0) {
			System.out.println(numRegistros + " insertados");
		} else {
			System.out.println("No se han insertado registros");
		}
	}

}
