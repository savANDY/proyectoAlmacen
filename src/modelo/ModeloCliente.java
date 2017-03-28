package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloCliente extends Conectar {

	public ModeloCliente() {
		super();
	}

	public ArrayList<Cliente> seleccionarTodos() throws Exception {
		PreparedStatement pst;
		Cliente cliente;

		try {
			pst = cn.prepareStatement("SELECT * FROM clientes");

			ResultSet rs = pst.executeQuery();// ejecuta

			// pasar de ResultSet a ArrayList

			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			while (rs.next()) {
				cliente = new Cliente();

				cliente.setId(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setDireccion(rs.getString(3));
				cliente.setCodPostal(rs.getString(4));
				cliente.setTelefono(rs.getString(5));
				// System.out.println(cliente.getNombre());
				clientes.add(cliente);
			}
			return clientes;

		} catch (Exception e) {
			throw e;

		}
	}

	public void insertar(Cliente cliente) throws Exception {

		PreparedStatement pst;
		try {
			pst = cn.prepareStatement(
					"INSERT INTO CLIENTES(id,nombre,direccion,codPostal,telefono) VALUES (?,?,?,?,?)");

			pst.setString(1, cliente.getId());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getDireccion());
			pst.setString(4, cliente.getCodPostal());
			pst.setString(5, cliente.getDireccion());

			System.out.println(pst);
			pst.execute();
			System.out.println("Cliente insertado correctamente");
		} catch (Exception e) {
			System.out.println("Error al insertar cliente");
			throw e;
		}

	}

}
