package Objeto;

public class ClienteC {

	private String Cedula;
	private String lista;
	private int cantidad;
	
	public ClienteC(String cedula, String lista, int cantidad) {
		
		this.Cedula = cedula;
		this.lista = lista;
		this.cantidad = cantidad;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
