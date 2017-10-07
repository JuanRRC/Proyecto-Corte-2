package Objeto;

public class Cliente {

	private String nombre,apellido,cedula,empresa;
	private int edad;
	private float sueldo;
	private String Foto;
	
	
	public Cliente(String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, String foto) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.empresa = empresa;
		this.edad = edad;
		this.sueldo = sueldo;
		this.Foto = foto;
		
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

	public String getFoto() {
		return Foto;
	}

	public void setFoto(String foto) {
		Foto = foto;
	}

	//String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, String foto
	public Object[] getDetalles() {
		Object[] data = {this.nombre,this.apellido,this.cedula,this.empresa,this.edad,this.sueldo,this.Foto};
		System.out.println(data);
		return data;
	}
	

	public static Cliente build(String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, String foto){
		return new Cliente(nombre,apellido,cedula,empresa,edad,sueldo,foto);
	}

	public String toString() {
		
		return nombre+apellido+cedula+empresa+edad+sueldo+Foto;
	}
	
	
	
	
	
	
	
	
}
