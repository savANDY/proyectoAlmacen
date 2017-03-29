package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModeloArticulo extends Conectar {

	public ModeloArticulo() {
		super();
	}

	public ArrayList<Articulo> seleccionarTodos(){
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

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
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

	public Articulo select(int idArticulo) {
		PreparedStatement ps;
		Articulo articulo;
		try {
			ps = cn.prepareStatement("select * from articulos where id = ?");
			ps.setInt(1, idArticulo);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				articulo = new Articulo();
				articulo.setId(rs.getInt("id"));
				articulo.setNombre(rs.getString("nombre"));
				articulo.setProveedor(rs.getString("proveedor"));
				articulo.setPrecio(rs.getDouble("precio"));
				articulo.setExistencias(rs.getInt("existencias"));
				return articulo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public int modificar(Articulo articulo) {

		int lineascambiadas;
		try {
			Statement st = super.cn.createStatement();
			lineascambiadas = st.executeUpdate("UPDATE articulos " + "SET nombre='" + articulo.getNombre() + "'" + ",proveedor='" + articulo.getProveedor() + "'"
					+ ",precio='" + articulo.getPrecio() + "'" + ",existencias='" + articulo.getExistencias() + "'" + " WHERE id=" + articulo.getId());
			JOptionPane.showMessageDialog(null, "Articulo (" + articulo.getId() + ") modificado correctamente.");
			return lineascambiadas;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al modificar articulo", "Error",JOptionPane.ERROR_MESSAGE);
//			e.printStackTrace();
		}
		return 0;
		
	}
	
}
