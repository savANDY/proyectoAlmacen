package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloPedido extends Conectar {

	public ArrayList<Pedido> seleccionarTodos() {
		
		PreparedStatement pst;
		Pedido pedido;

		try {
			pst = cn.prepareStatement("SELECT * FROM pedidos");

			ResultSet rs = pst.executeQuery();// ejecuta

			// pasar de ResultSet a ArrayList

			ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
			while (rs.next()) {
				pedido = new Pedido();

				pedido.setId(rs.getInt(1));
				pedido.setIdCliente(rs.getString(2));
				pedido.setFecha(rs.getDate(3));
				pedido.setCodPostal(rs.getString(4));
				System.out.println(pedido.getId());
				pedidos.add(pedido);
			}
			return pedidos;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
