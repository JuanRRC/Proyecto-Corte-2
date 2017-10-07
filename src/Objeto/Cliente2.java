package Objeto;

public class Cliente2 implements Comparable<Cliente2> {

	private String nombre,apellido,cedula,empresa,edad,sueldo,foto;

	public Cliente2(String nombre, String apellido, String cedula, String empresa, String edad, String sueldo,
			String foto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.empresa = empresa;
		this.edad = edad;
		this.sueldo = sueldo;
		this.foto = foto;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	public Object[] getDetalles() {
		Object[] data = {this.nombre,this.apellido,this.cedula,this.empresa,this.edad,this.sueldo,this.foto};
		System.out.println(data);
		return data;
	}
	

	public static Cliente2 build(String nombre, String apellido, String cedula, String empresa, String edad, String sueldo, String foto){
		return new Cliente2(nombre,apellido,cedula,empresa,edad,sueldo,foto);
	}

	public String toString() {
		
		return nombre+apellido+cedula+empresa+edad+sueldo+foto;
	}

	@Override
	public int compareTo(Cliente2 o) {
		 String a=new String(String.valueOf(o.getApellido()));
	     String b=new String(String.valueOf(o.getApellido()));
		return b.compareTo(a);
	}
	
	
}
