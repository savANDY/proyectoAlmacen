package controlador;

import java.util.Date;

public class Pedido {

	private int id;
	private String id_cliente;
	private Date fecha;
	private String codPostal;

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	// Constructor
	public Pedido(int id, String id_cliente, Date fecha, String codPostal) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.codPostal = codPostal;
	}

	// Constructor vacio
	public Pedido() {
		super();
	}

}
