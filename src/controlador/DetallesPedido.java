package controlador;

public class DetallesPedido {
	
	private int id_pedido;
	private int id_producto;
	private int cantidad;
	
	// Getters y Setters
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	// Constructor
	public DetallesPedido(int id_pedido, int id_producto, int cantidad) {
		super();
		this.id_pedido = id_pedido;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
	}
	
	// Constructor vacio
	public DetallesPedido() {
		super();
	}
	
	

}
