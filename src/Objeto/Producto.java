package Objeto;



public class Producto implements Comparable<Producto> {

	private String nombre,marca;
	private int cantidad,valor;
	private float peso;
	
	public Producto(String nombre, String marca, int cantidad, int valor, float peso) {
		
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.valor = valor;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Object[] getDetalles() {
		Object[] data = {this.nombre,this.marca,this.cantidad,this.valor,this.peso};
		System.out.println(data);
		return data;
	}
	
	
	
    //String nombre, String marca, int cantidad, int valor, float peso
	public static Producto build(String nombre, String marca, int cantidad, int valor, float peso){
		return new Producto(nombre,marca,cantidad,valor,peso);
	}

	public String toString() {
		
		return nombre+marca+cantidad+valor+peso;
	}
	
	@Override
	public int compareTo(Producto o) {
		if (cantidad > o.cantidad) {
	        return 1;
	    }
	    if (cantidad < o.cantidad) {
	        return -1;
	    }
		return 0;
	}
	
}
