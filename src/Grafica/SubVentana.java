package Grafica;

import Objeto.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JSpinner;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;

public class SubVentana extends JFrame{
	
	private JTextField nomp,valorp;
	private JButton Agregar;
	private JSpinner cantip,pesop;
	private JComboBox marcap;
	private ArrayList<Producto> lista = new ArrayList<Producto>();
	
	
	
	public ArrayList<Producto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Producto> lista) {
		this.lista = lista;
	}

	public SubVentana (){
		 super("Programa");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
        setLocationRelativeTo( null );
	}
	
	public SubVentana iniciar(){
				
				Dimension dims = new Dimension(250, 250);
				this.setSize(dims);
				this.setPreferredSize(dims);
				return this;
	}
	
	
	public void componente() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel nombrep = new JLabel("Nombre :");
		nombrep.setBounds(10, 11, 46, 14);
		getContentPane().add(nombrep);
		
		nomp = new JTextField();
		nomp.setBounds(87, 8, 86, 20);
		getContentPane().add(nomp);
		nomp.setColumns(10);
		
		JLabel cantidad = new JLabel("Cantidad :");
		cantidad.setBounds(10, 39, 57, 14);
		getContentPane().add(cantidad);
		
		cantip = new JSpinner();
		cantip.setBounds(87, 39, 29, 20);
		getContentPane().add(cantip);
		
		JLabel marca = new JLabel("Marca :");
		marca.setBounds(10, 73, 46, 14);
		getContentPane().add(marca);
		
		marcap = new JComboBox();
		marcap.setBounds(88, 70, 85, 20);
		getContentPane().add(marcap);
		
		JLabel peso = new JLabel("Peso :");
		peso.setBounds(10, 104, 46, 14);
		getContentPane().add(peso);
		
		pesop = new JSpinner();
		pesop.setBounds(87, 101, 29, 20);
		getContentPane().add(pesop);
		
		JLabel valor = new JLabel("Valor :");
		valor.setBounds(10, 135, 46, 14);
		getContentPane().add(valor);
		
		valorp = new JTextField();
		valorp.setBounds(87, 132, 86, 20);
		getContentPane().add(valorp);
		valorp.setColumns(10);
		
		Agregar = new JButton("Agregar");
		Agregar.setBounds(10, 177, 89, 23);
		getContentPane().add(Agregar);
	}
	
	private SubVentana Eventos() {
		ManejadorDeEventos manejador = new ManejadorDeEventos();
		Agregar.setActionCommand("Agregar");
		

		
		Agregar.addActionListener(manejador);

	
		return this;
	}
	
	private class ManejadorDeEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
				case "Agregar":
					String nombre = nomp.getText();
					int cant = (int) cantip.getValue(); 
					String mar = (String) marcap.getSelectedItem();
					float pes = (float) pesop.getValue();
					String val = valorp.getText();
					int valorpr = Integer.parseInt(val);
	//String nombre, String marca, int cantidad, int valor, float peso
					Producto p = new Producto(nombre,mar,cant,valorpr,pes);
					lista.add(new Producto(nombre,mar,cant,valorpr,pes));
					break;
			}
		}
    }
	
	
	
}
