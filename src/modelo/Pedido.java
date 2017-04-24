package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int id;
	private String idCliente;
	private Date fecha;
	private String codPostal;
	
	private ArrayList<DetallesPedido> detallesPedido;  // tiene N DetallesPedido  
	private Cliente cliente; // LO HACE 1 CLIENTE

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String id_cliente) {
		this.idCliente = idCliente;
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
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.codPostal = codPostal;
	}

	// Constructor vacio
	public Pedido() {
		super();
	}



}
