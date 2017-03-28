package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModeloArticulo extends Conectar {

	public ModeloArticulo() {
		super();
	}

	public void insertar(Articulo articulo) throws Exception {

		PreparedStatement pst;
		try {
			System.out.println("Estoy dentro del insertar en el modelo");

			pst = cn.prepareStatement(
					"INSERT INTO ARTICULOS(id,nombre,proveedor,precio,existencias) VALUES (?,?,?,?,?)");

			pst.setInt(1, articulo.getId());
			pst.setString(2, articulo.getNombre());
			pst.setString(3, articulo.getProveedor());
			pst.setDouble(4, articulo.getPrecio());
			pst.setInt(5, articulo.getExistencias());

			System.out.println(pst);

			pst.execute();
			System.out.println("Articulo insertado correctamente");
		} catch (Exception e) {
			System.out.println("Error al insertar articulo");
			// e.getMessage();
			// e.getStackTrace();
			throw e;
		}

	}

}
