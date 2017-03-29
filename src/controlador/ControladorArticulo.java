package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import modelo.*;
import vista.articulo.*;
import vista.cliente.VerClientes;

public class ControladorArticulo {

	private GestionArticulo gestionArticulo;
	private VerArticulos verArticulos;
	private NuevoArticulo nuevoArticulo;
	private ModeloArticulo modeloArticulo;

	// Constructor vacio
	public ControladorArticulo() {
		super();
	}
	
	// Getters y Setters
	
	public VerArticulos getVerArticulos() {
		return verArticulos;
	}

	public void setVerArticulos(VerArticulos verArticulos) {
		this.verArticulos = verArticulos;
	}
	
	public GestionArticulo getGestionArticulo() {
		return gestionArticulo;
	}

	public void setGestionArticulo(GestionArticulo gestionArticulo) {
		this.gestionArticulo = gestionArticulo;
	}

	public ModeloArticulo getModeloArticulo() {
		return modeloArticulo;
	}

	public void setModeloArticulo(ModeloArticulo modeloArticulo) {
		this.modeloArticulo = modeloArticulo;
	}
	
	public NuevoArticulo getNuevoArticulo() {
		return nuevoArticulo;
	}

	public void setNuevoArticulo(NuevoArticulo nuevoArticulo) {
		this.nuevoArticulo = nuevoArticulo;
	}
	

	// funciones
	public void abrirGestionArticulo() {

		gestionArticulo.setVisible(true);

	}
	
	public void abrirVerArticulos() {

		ArrayList<Articulo> articulos;

		try {

			articulos = modeloArticulo.seleccionarTodos();
			verArticulos.rellenarTabla(articulos);

			verArticulos.setVisible(true);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL SELECCIONAR ARTICULOS");
			// e.printStackTrace();
			// e.getMessage();
		}
	}

	public void abrirNuevoArticulo() {

		nuevoArticulo.setVisible(true);

	}

	public void insertarArticulo(int id, String nombre, String proveedor, Double precio, int existencias) {
		
		System.out.println("Estoy dentro del insertar en el controlador");
		
		Articulo articulo = new Articulo();

		articulo.setId(id);
		articulo.setNombre(nombre);
		articulo.setProveedor(proveedor);
		articulo.setPrecio(precio);
		articulo.setExistencias(existencias);

		System.out.println("Estoy dentro del insertar en el controlador, con el objeto creado");
		
		System.out.println(articulo.getId());
		System.out.println(articulo.getNombre());
		System.out.println(articulo.getProveedor());
		System.out.println(articulo.getPrecio());
		System.out.println(articulo.getExistencias());
		
		try {
			modeloArticulo.insertar(articulo);
			
			JOptionPane.showMessageDialog(null, "ARTICULO INSERTADO EN LA BD");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR ARTICULO");
			e.getMessage();
//			e.printStackTrace();
		}
		
	}

	public void abrirModificarArticulo() {
		
//		ModificarArticulo.setVisible(true);
		
	}

}
