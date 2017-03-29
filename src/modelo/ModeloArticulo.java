package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloArticulo extends Conectar {

	public ModeloArticulo() {
		super();
	}

	public ArrayList<Articulo> seleccionarTodos() throws Exception {
		PreparedStatement pst;
		Articulo articulo;

		try {
			pst = cn.prepareStatement("SELECT * FROM articulos");

			ResultSet rs = pst.executeQuery();// ejecuta

			// pasar de ResultSet a ArrayList

			ArrayList<Articulo> articulos = new ArrayList<Articulo>();
			while (rs.next()) {
				articulo = new Articulo();

				articulo.setId(rs.getInt(1));
				articulo.setNombre(rs.getString(2));
				articulo.setProveedor(rs.getString(3));
				articulo.setPrecio(rs.getDouble(4));
				articulo.setExistencias(rs.getInt(5));
				// System.out.println(cliente.getNombre());
				articulos.add(articulo);
			}
			return articulos;

		} catch (Exception e) {
			throw e;

		}
	}
	
	public void insertar(Articulo articulo) throws Exception {
		System.out.println("Estoy dentro del insertar en el modelo");
		PreparedStatement pst;
		try {
			

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
