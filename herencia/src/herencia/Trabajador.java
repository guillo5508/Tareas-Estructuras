package herencia;

public class Trabajador {
	
	protected String nombre;
	protected float sb; //salario basico
	protected float dt; //dias trabajados
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getSb() {
		return sb;
	}



	public void setSb(float sb) {
		this.sb = sb;
	}



	public float getDt() {
		return dt;
	}



	public void setDt(float dt) {
		this.dt = dt;
	}



	public Trabajador(String nombre, float sb, float dt) {
		super();
		this.nombre = nombre;
		this.sb = sb;
		this.dt = dt;
	}
	
	
	public float salario() {
		return sb*dt/24;
	}
	
	public static void main(String[] args) {
		Trabajador t1 = new Trabajador("Guillermo", 737000, 24);
		//System.out.println(t1.salario());
		
		Trabajador l= new EmpLimpieza("Juanito", 737000, 24, 50, 40);
		//System.out.println(l.salario());
		((EmpLimpieza)l).getNorma();//ejemplo de como se llaman los metodos propios de una clase hija
		Trabajador[] listaT = new Trabajador[2];
		listaT[0]=t1;
		listaT[1]=l;
		for(Trabajador t:listaT) {
			System.out.println("Salario: "+ t.salario());
			if(t instanceof EmpLimpieza) {
				System.out.println("norma: "+ ((EmpLimpieza)t).getNorma());
			}
		}
	}
}
