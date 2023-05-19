package unidad8.clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaBBDD {
	
	public static BaseDatos bd;
	
	public static void main(String[] args)  {
		
		//Creamos el objeto que nos conecta a la BBDD
		BaseDatos bbdd = new BaseDatos();
		
		
		//Diferentes sentencias SQL
//		String query = "INSERT INTO Productos (Nombre, descripcion, precio) VALUES ('peras','muy ricas','2')";		
//		String query = "UPDATE productos SET precio='3' WHERE Nombre='peras'";
//		String query = "DELETE FROM productos WHERE Nombre='peras'";
		
		
		//Metodo para realizar las operaciones anteriores de INSERT, UPDATE o DELETE
//		bbdd.modificarDatos(query);
		
		
		//Sentencia para seleccionar registros
		String select = "SELECT * FROM vendedores";
		
		//El metodo devuelve un ResultSet (imaginad que es un array o ArrayList)
		ResultSet rs = bbdd.consultaBD(select);
		
		try {
			//Mientras existan registros lee. 						
			while(rs.next()) {
				//Podemos acceder a los registros de la select mediante el nombre de la columna de la tabla
				System.out.println("nombre :"+ rs.getString("nombre"));
				System.out.println("descripcion :"+ rs.getString("dni"));
				System.out.println("precio :"+ rs.getInt("telefono"));
				
				// O bien acceder al indice de la columna de la tabla
				System.out.println("nombre :"+ rs.getString(1));
				System.out.println("dni :"+ rs.getString(2));
				System.out.println("telefono :"+ rs.getInt(3));
			
			//IMPORTANTE QUE EL GET DEL rs coincida con el tipo de campo de la tabla
			
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//cerramos la conexion
		bbdd.cerrarCons();
	}

}
