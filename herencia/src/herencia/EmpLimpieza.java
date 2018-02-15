package herencia;

public class EmpLimpieza extends Trabajador {
	private float norma;
	private float cump;
	

	public float getNorma() {
		return norma;
	}

	public void setNorma(float norma) {
		this.norma = norma;
	}

	public float getCump() {
		return cump;
	}

	public void setCump(float cump) {
		this.cump = cump;
	}

	public EmpLimpieza(String nombre, float sb, float dt, float norma, float cump) {
		super(nombre, sb, dt);
		this.norma=norma;
		this.cump=cump;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float salario() {
		// TODO Auto-generated method stub
		return (float) (super.salario()+super.salario()*0.1*cump/norma);
		
		
		
	}
	
}
