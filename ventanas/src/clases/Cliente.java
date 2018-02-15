package clases;

public class Cliente {
	private String nombre;
	private String cedula;
	private String telefono;
	private String edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Cliente(String nombre, String cedula, String telefono, String edad) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	
}
