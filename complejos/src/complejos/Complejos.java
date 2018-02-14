package complejos;

public class Complejos {
	
	private double parteReal;
	private double parteImaginaria;
	
	

	public double getParteReal() {
		return parteReal;
	}



	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}



	public double getParteImaginaria() {
		return parteImaginaria;
	}



	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	



	public Complejos(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public double modulo() {
		return (Math.sqrt(Math.pow(getParteReal(), 2)+Math.pow(getParteImaginaria(), 2)));
	}
	public double argumento() {
		return Math.atan(getParteImaginaria()/getParteReal());
	}



	public static void main(String[] args) {
		
		Complejos numero = new Complejos(35,-4);
		System.out.println(numero.modulo());
		System.out.println(numero.argumento());

	}

}
