package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultTextUI;

import clases.Banco;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FormEjemplo extends JFrame {

	private JPanel contentPane;
	private Banco banco;//para que la ventana pueda operar con objetos debemos pasarle como atributo el objeto que queremos operar
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { FormEjemplo frame = new FormEjemplo();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public FormEjemplo(Banco banco) {//se lo pasamos al constructor
		this.banco = banco;//lo declaramos
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//una vez creado el absoluteLayout se agrega un scrollPane y dentro de su casilla mas grande se agrega el JTable
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 70, 533, 259);
		contentPane.add(scrollPane);

		String[] titulos = { "Nombre", "Cedula", "Telefono", "Edad" };//para agregar los titulos a nuestra tabla creamos un arreglo con los titulos

		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);//luego creamos un objeto tipo DefaultTableModel y le pasamos como primer parametro
																	//los titulos que seran el numero de columnas y 0 para el numero de filas
		table = new JTable(modelo);//luego a la JTable le pasamos el modelo de tabla
		scrollPane.setViewportView(table);

		JButton btnListar = new JButton("Listar");

		btnListar.setBounds(289, 377, 117, 25);
		contentPane.add(btnListar);
		
		
		String[] items = { "Muestra", "No muestra" };//creamos un arreglo con los items deseados
		JComboBox comboBox = new JComboBox(items);//agregamos los items como parametro al constructor del comboBox
		comboBox.addItem("Nada");//Tambien podemos ingresar individualmente los items
		comboBox.setBounds(374, 34, 164, 24);
		contentPane.add(comboBox);

		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
					modelo.removeRow(i);//este ciclo borra las filas de la tabla de abajo hacia arriba cada vez que se da click
				}
				if (comboBox.getSelectedIndex()==0) {
					for (int i = 0; i < banco.getListaClientes().length; i++) {
						String[] valores = { banco.getListaClientes()[i].getNombre(),
											banco.getListaClientes()[i].getCedula(), 
											banco.getListaClientes()[i].getTelefono(),
											banco.getListaClientes()[i].getEdad() };
						modelo.addRow(valores);//se crea un arreglo con los datos que deseamos imprimir en la tabla y se lo pasamos a la funcion
												//addRow, esto los imprimira en una fila
					}
					JOptionPane.showMessageDialog(contentPane, "Proceso exitoso");//asi se generan mensajes eergentes
				} else {
					JOptionPane.showMessageDialog(contentPane, "No se puede mostrar");//se pueden mostrar los mensajes de excepciones de esta forma
				}

			}
		});

	}
}
