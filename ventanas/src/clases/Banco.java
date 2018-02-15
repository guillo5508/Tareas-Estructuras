package clases;

import Forms.FormEjemplo;

public class Banco {

	private Cliente[] listaClientes;

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Banco(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("maria", "837849", "947489", "15");
		Cliente c2 = new Cliente("marcela", "3784946", "00000", "20");
		Cliente c3 = new Cliente("oscar", "847484", "9867", "16");
		Cliente[] lista= new Cliente[3];
		lista[0]=c1;
		lista[1]=c2;
		lista[2]=c3;
		Banco banco = new Banco(lista);
		FormEjemplo ejemplo = new FormEjemplo(banco);//forma de crear la plantilla de ventana
		ejemplo.setVisible(true);//forma de invocar a la ventana
	}

}
