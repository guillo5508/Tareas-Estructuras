package estudiante;


public class Estudiante {
	private double nota1;
	private double nota2;
	private double nota3;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public Estudiante(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public char calificacion() {
		double notaFinal = (getNota1() + getNota2() + getNota3()) / 3;
		switch (String.valueOf(notaFinal).charAt(0)) {
		case '5':
			return 'B';
		case '4':
			return 'B';
		case '3':
			return 'R';
		case '2':
			return 'M';
		default:
			return 'M';
			//////
		}
	}

	public static void main(String[] args) {
		Estudiante guillermo = new Estudiante(1.6, 1.2, 1.1);
		System.out.println(guillermo.calificacion());

	}

}
