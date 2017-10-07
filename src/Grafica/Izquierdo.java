package Grafica;

import Objeto.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;






public class Izquierdo extends JPanel implements ActionListener {


    public static final String AGREGAR = "AGREGAR";
    public static final String LISTARI = "LISTARI";
    public static final String ALERTA = "ALERTA";
    public static final String REGISTRAR = "REGISTRAR";
    public static final String LISTARC = "LISTARC";
    public static final String MEJORES = "MEJORES";
    public static final String COMPRA = "AGREGARP";
    public static final String ELIMINAR = "AGREGARP";
	 /**
     * Botón para agregar 
     */
    //private Derecho mapa3;
    private SubVentana sub1;
    private JButton agregar,listari,alerta,registrar,listarc,mejores,compra,eliminar;
    private JTextField nombrep,valor,nombre,apellido,cedula,edad,empresa,sueldo;
    private JComboBox marca,listado;
    private JSpinner cantidad1,cantidad2,peso;
    private String[] columnas = {" Nombre ", " Marca ", " Cantidad ", " Peso(kg) ", " Valor Unitario "};
    private String[] columnas2 = {" Nombre ", " apellido ", " cedula ", " edad ", " empresa "," sueldo actual "," foto "};
    //private ArrayList<Persona> lista2 = new ArrayList<Persona>();
    private ArrayList<Producto> lista3 = new ArrayList<Producto>();
    private ArrayList<Cliente> lista4 = new ArrayList<Cliente>();
    private ArrayList<Producto> lista5 = new ArrayList<Producto>();
    private ArrayList<Cliente2> lista2 = new ArrayList<Cliente2>();
    private Map<Integer, String> mapa = new TreeMap<Integer, String>();
    private ArrayList<Object[]> lista1 = new ArrayList<Object[]>();
    private DefaultTableModel referencia_tabla_model;
	private ArrayList<Object[]> referencia_almacen;
	
	
	public Izquierdo(DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen) {
		super();
		this.referencia_tabla_model = referencia_tabla_model;
		this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  
	}

	public void iniciar() {

		 		
        setLayout( new GridBagLayout( ) );

        Border borde = BorderFactory.createTitledBorder( "Datos" );
        setBorder( borde );
        
       
        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;

        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        
        
        agregar = new JButton( "Agregar" );
        agregar.addActionListener( this );
        agregar.setActionCommand( AGREGAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( agregar, constraint );
	
        agregar = new JButton( "juan" );
        agregar.addActionListener( this );
        agregar.setActionCommand( AGREGAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 16;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( agregar, constraint );
	
        
        listari = new JButton( "Ver Inventario" );
        listari.addActionListener( this );
        listari.setActionCommand( LISTARI );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( listari, constraint );
        
        alerta = new JButton( "Alerta de inventario" );
        alerta.addActionListener( this );
        alerta.setActionCommand( ALERTA );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( alerta, constraint );
        
        
        //agregar,listari,alerta,registrar,listarc,mejores,compra,eliminar;
        registrar = new JButton( "Registrar" );
        registrar.addActionListener( this );
        registrar.setActionCommand( REGISTRAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 6;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 30, 10, 5, 10 );
        constraint.insets = insets;	        
        add( registrar, constraint );
        
        listarc = new JButton( "Listado de clientes" );
        listarc.addActionListener( this );
        listarc.setActionCommand( LISTARC );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 7;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( listarc, constraint );
        
        mejores = new JButton( "Mejores Clientes" );
        mejores.addActionListener( this );
        mejores.setActionCommand( MEJORES );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 8;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( mejores, constraint );
        
        compra = new JButton( "Iniciar Compra" );
        compra.addActionListener( this );
        compra.setActionCommand( COMPRA );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 13;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 50, 10, 5, 10 );
        constraint.insets = insets;	        
        add( compra, constraint );
        
        eliminar = new JButton( "Eliminar compra" );
        eliminar.addActionListener( this );
        eliminar.setActionCommand( ELIMINAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 14;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( eliminar, constraint );
        
        SpinnerNumberModel sModel = new SpinnerNumberModel(0, 0, 30, 1);
        cantidad1 = new JSpinner(sModel);
        
        SpinnerNumberModel sModel2 = new SpinnerNumberModel(0, 0, 30, 1);
        cantidad2 = new JSpinner(sModel2);
        
        SpinnerNumberModel sModel3 = new SpinnerNumberModel(0, 0, 30, 1);
        peso = new JSpinner(sModel3);
        
        marca = new JComboBox();
		marca.setModel(new DefaultComboBoxModel(new String[] {"SONY","OZTER", "SAMURAI", "CHALENGER", "SAMSUNG", "LG"}));
        
        
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String accion = e.getActionCommand( );
        if( accion.equals( AGREGAR ) ) {
        	
        	
        	String nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
            JOptionPane.showMessageDialog(null, cantidad1,"Indique la cantidad ", JOptionPane.QUESTION_MESSAGE);
            int can =(int) cantidad1.getValue() ;
            JOptionPane.showMessageDialog( null, marca, "selecione la marca", JOptionPane.QUESTION_MESSAGE);
            String mar = (String) marca.getSelectedItem();
            JOptionPane.showMessageDialog(null, peso,"Indique el peso ", JOptionPane.QUESTION_MESSAGE);
            int p =(int) peso.getValue() ;
            int val = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor unitario del producto"));
            
            //String nombre, String marca, int cantidad, int valor, float peso
            lista3.add(new Producto(nombre,mar,can,val,p));
            
        }
        
        if( accion.equals( REGISTRAR ) ) {
//String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, String foto,double compras        	
        	String nombrec = JOptionPane.showInputDialog("  Nombre  ");
        	String apellido = JOptionPane.showInputDialog(" Apellido ");
        	String cedula = JOptionPane.showInputDialog("   Cedula    ");
        	String ed = JOptionPane.showInputDialog(" Edad ");
        	int edad = Integer.parseInt(ed);
        	String empresa = JOptionPane.showInputDialog(" Empresa ");
        	String s = JOptionPane.showInputDialog(" Sueldo actual ");
        	float suel = Float.parseFloat(s);
        	String foto = JOptionPane.showInputDialog(" foto ");
        	
        	lista4.add(new Cliente(nombrec,apellido,cedula,empresa,edad,suel,foto));
        	lista2.add(new Cliente2(nombrec,apellido,cedula,empresa,ed,s,foto));
        }
        	
        if( accion.equals( LISTARI ) ) {
        	
        	 Iterator<Producto> it = lista3.iterator();
             Producto ob;
             while (it.hasNext()){
                 ob = it.next();
                 referencia_almacen.add(ob.getDetalles());
         		 Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
         		 referencia_tabla_model.setDataVector(datos, columnas);
                  
             }
        	
        }
        
        if( accion.equals( LISTARC ) ) {
        	
            Collections.sort(lista2);
        	
        	
        	Iterator<Cliente2> it = lista2.iterator();
            Cliente2 ob;
            while (it.hasNext()){
                ob = it.next();
                referencia_almacen.add(ob.getDetalles());
        		 Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
        		 referencia_tabla_model.setDataVector(datos, columnas2);
                 
            }
        }
        
        if( accion.equals( ALERTA ) ) {
        	
        	Iterator<Producto> it = lista3.iterator();
            Producto ob;
            while (it.hasNext()){
                ob = it.next();
                if(ob.getCantidad()<=10) {
                	referencia_almacen.add(ob.getDetalles());
           		 	Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
           		 	referencia_tabla_model.setDataVector(datos, columnas);             	
                }
                
                 
            }
        }
        
        if( accion.equals( MEJORES ) ) {
        	
        	
        }
            
            
            
        }
        
            }
        	
        
		
		
	
