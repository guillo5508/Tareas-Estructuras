package poligonos;


public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double perimetro() {
		return getLadoA() + getLadoB() + getLadoC();
	}

	public double area() {
		double p = (perimetro() / 2);
		return (Math.sqrt(p * (p - getLadoA()) * (p - getLadoB()) * (p - getLadoC())));
	}

	public char clasificacion() {
		if (getLadoA() == getLadoB() && getLadoB() == getLadoC()) {
			return 'q';
		} else {
			if (getLadoB() == getLadoC() || getLadoA() == getLadoC() || getLadoA() == getLadoB()) {
				return 'i';
			} else {
				return 'e';
			}
		}
	}
	

	public char clasificar2() {
		return (getLadoA() == getLadoB() && getLadoB() == getLadoC()) ? 'q'
				: (getLadoB() == getLadoC() || getLadoA() == getLadoC() || getLadoA() == getLadoB()) ? 'i' : 'e';
	}
	

	public static void main(String[] args) {
		Triangulo t = new Triangulo(1, 1, Math.sqrt(2));
		System.out.println(t.clasificacion());
		System.out.println(t.clasificar2());
		System.out.println(t.area());
		System.out.println(t.perimetro());
	}

}
