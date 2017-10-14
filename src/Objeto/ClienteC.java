package Objeto;

import java.util.Map;
import java.util.TreeMap;

public class ClienteC implements Comparable<ClienteC>{

	private String Cedula;
	private String lista;
	private int cantidad;
	private int compra;
	
	public ClienteC(String cedula, String lista, int cantidad,int compra) {
		
		this.Cedula = cedula;
		this.lista = lista;
		this.cantidad = cantidad;
		this.compra=compra;
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

	public int getCompra() {
		return compra;
	}

	public void setCompra(int compra) {
		this.compra = compra;
	}


	@Override
	public int compareTo(ClienteC o) {
		// TODO Auto-generated method stub
		if (compra < o.compra) {
	        return 1;
	    }
	    if (compra > o.compra) {
	        return -1;
	    }
		
		return 0;
	}
	
	
	
}
