package Objeto;

import javax.swing.ImageIcon;

public class Cliente implements Comparable<Cliente>{

	private String nombre,apellido,cedula,empresa;
	private int edad;
	private float sueldo;
	private String Foto;
	private ImageIcon foto3;
	
	

	public Cliente(String nombre, String apellido, String cedula, String empresa, int edad, float sueldo,ImageIcon foto3) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.empresa = empresa;
		this.edad = edad;
		this.sueldo = sueldo;
		
		this.foto3 = foto3;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public float getSueldo() {
		return sueldo;
	}




	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}


	public ImageIcon getFoto3() {
		return foto3;
	}




	public void setFoto3(ImageIcon foto3) {
		this.foto3 = foto3;
	}




	//String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, String foto
	public Object[] getDetalles() {
		Object[] data = {this.nombre,this.apellido,this.cedula,this.empresa,this.edad,this.sueldo,this.foto3};
		System.out.println(data);
		return data;
	}
	

	public static Cliente build(String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, ImageIcon foto3){
		return new Cliente(nombre,apellido,cedula,empresa,edad,sueldo,foto3);
	}

	public String toString() {
		
		return nombre+apellido+cedula+empresa+edad+sueldo+foto3;
	}

	
	public int compareTo(Cliente o) {
		if (sueldo < o.sueldo) {
	        return 1;
	    }
	    if (sueldo > o.sueldo) {
	        return -1;
	    }
		return 0;
	}
	
	
	
	
	
	
	
	
}
