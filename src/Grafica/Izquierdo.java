package Grafica;

import Objeto.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
    public static final String COMPRA = "COMPRA";
    public static final String ELIMINAR = "ELIMINAR";
	 /**
     * Botón para agregar 
     */
    //private Derecho mapa3;
    private SubVentana sub1;
    private Inferior lista;
    private JFileChooser foto2;
    private JButton agregar,listari,alerta,registrar,listarc,mejores,compra,eliminar;
    private JTextField nombrep,valor,nombre,apellido,cedula,edad,empresa,sueldo;
    private JComboBox marca,listado,productos,cedula2;
    private JSpinner cantidad1,cantidad2,cantidad3,cantidad4,peso;
    private String[] columnas = {" Nombre ", " Marca ", " Cantidad ", " Peso(kg) ", " Valor Unitario "};
    private String[] columnas2 = {" Nombre ", " apellido ", " cedula ", " edad ", " empresa "," sueldo actual "," foto "};
    //private ArrayList<Persona> lista2 = new ArrayList<Persona>();
    private ArrayList<Producto> lista3 = new ArrayList<Producto>();
    private ArrayList<String> lista7 = new ArrayList<String>();
    private ArrayList<ClienteC> lista6 = new ArrayList<ClienteC>();
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

	
	
	
	
	public ArrayList<ClienteC> getLista6() {
		return lista6;
	}





	public void setLista6(ArrayList<ClienteC> lista6) {
		this.lista6 = lista6;
	}





	public ArrayList<Cliente> getLista4() {
		return lista4;
	}





	public void setLista4(ArrayList<Cliente> lista4) {
		this.lista4 = lista4;
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
        
        SpinnerNumberModel sModel4 = new SpinnerNumberModel(0, 0, 30, 1);
        cantidad3 = new JSpinner(sModel4);
        
        SpinnerNumberModel sModel5 = new SpinnerNumberModel(0, 0, 30, 1);
        cantidad4 = new JSpinner(sModel5);
        
        marca = new JComboBox();
		marca.setModel(new DefaultComboBoxModel(new String[] {"SONY","OZTER", "SAMURAI", "CHALENGER", "SAMSUNG", "LG"}));
        
		productos = new JComboBox();
		cedula2 = new JComboBox();
	    foto2 = new JFileChooser();
        
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
            productos.addItem(nombre);
            
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
        	//String foto = JOptionPane.showInputDialog(" foto ");
        	JOptionPane.showMessageDialog(null,foto2,"Seleccione el archivo ", JOptionPane.QUESTION_MESSAGE);
        	String direc = foto2.getSelectedFile().getPath();
        	System.out.println("imagen :"+direc);
        	lista4.add(new Cliente(nombrec,apellido,cedula,empresa,edad,suel,createImage(direc)));

        	String cli = apellido+"-"+nombrec+"-"+cedula+"-"+ed+"-"+empresa+"-"+s+"-"+direc;
        	
        	lista7.add(cli);
        	cedula2.addItem(cedula);
        	
        }
        	
        if( accion.equals( LISTARI ) ) {
        	referencia_almacen.clear();
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
        	referencia_almacen.clear();
            
        	Collections.sort(lista7);
        	
        	Iterator<String> it = lista7.iterator();
            String ob;
            while (it.hasNext()){
                ob = it.next();
                String[] parts = ob.split("-");
            	String part1 = parts[0];
            	String part2 = parts[1];
            	String part3 = parts[2];
            	String part4 = parts[3];
            	String part5 = parts[4];
            	String part6 = parts[5];
            	String part7 = parts[6];
            	System.out.println("entre");
            	lista2.add(new Cliente2(part2,part1,part3,part4,part5,part6,part7));	
                 
            }
            
            referencia_almacen.clear();
            Iterator<Cliente2> it2 = lista2.iterator();
            Cliente2 ob2;
            while (it2.hasNext()){
                ob2 = it2.next();
                System.out.println("entre2");
                referencia_almacen.add(ob2.getDetalles());
        		 Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
        		 referencia_tabla_model.setDataVector(datos, columnas2);
        		 
                 
            }
           
            
        }
        
        if( accion.equals( ALERTA ) ) {
        	referencia_almacen.clear();
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
        	referencia_almacen.clear();
        	Collections.sort(lista4);
        	int cont = 0;
        	Iterator<Cliente> it = lista4.iterator();
        	Cliente ob;
            while (it.hasNext()){
                ob = it.next();
                if(cont<3) {
                	referencia_almacen.add(ob.getDetalles());
           		 	Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
           		 	referencia_tabla_model.setDataVector(datos, columnas2);    
           		 	cont++;
                }
                
                 
            }
        	
        	
        }
        
        if( accion.equals( COMPRA ) ) {
        	
        	JOptionPane.showMessageDialog( null, cedula2, "Seleccione la cedula del comprador", JOptionPane.QUESTION_MESSAGE);
            String ced = (String) cedula2.getSelectedItem();
        	
            JOptionPane.showMessageDialog( null, productos, "selecione el producto a comprar", JOptionPane.QUESTION_MESSAGE);
            String pro = (String) productos.getSelectedItem();
            
            JOptionPane.showMessageDialog(null, cantidad3,"Indique la cantidad ", JOptionPane.QUESTION_MESSAGE);
            int can3 =(int) cantidad3.getValue() ;
            
            
        	
            int pre=0;
            Iterator<Producto> it = lista3.iterator();
            Producto ob;
            while (it.hasNext()){
                ob = it.next();
                if(ob.getNombre()==pro) {
                	pre = ob.getValor()*can3;
                	ob.setCantidad(ob.getCantidad()-can3);
                }
                
                 
            }
            lista6.add(new ClienteC(ced,pro,can3,pre));    
            String nl = System.getProperty("line.separator");
            JOptionPane.showMessageDialog(null,"-------Factura--------"+nl+"Producto :"+pro+nl+"Valor de la compra : "+pre);
            
            lista = new Inferior(lista4,lista6);
            
        }
         
        
        if( accion.equals( ELIMINAR ) ) {
        	JOptionPane.showMessageDialog( null, cedula2, "Seleccione la cedula del comprador", JOptionPane.QUESTION_MESSAGE);
            String cedu = (String) cedula2.getSelectedItem();
            JComboBox aux = new JComboBox();
            Iterator<ClienteC> it = lista6.iterator();
            ClienteC ob;
            while (it.hasNext()){	
                ob = it.next();
                if(ob.getCedula()==cedu) {
                	aux.addItem(ob.getLista());
                }               
            }
            
            JOptionPane.showMessageDialog( null, aux, "Lista de productos", JOptionPane.QUESTION_MESSAGE);
            String pro = (String) aux.getSelectedItem();
        	
            JOptionPane.showMessageDialog(null, cantidad4,"Indique la cantidad ", JOptionPane.QUESTION_MESSAGE);
            int can4 =(int) cantidad4.getValue() ;
            
            
            Iterator<Producto> it2 = lista3.iterator();
            Producto ob2;
            while (it2.hasNext()){
                ob2 = it2.next();
                if(ob2.getNombre()==pro) {
                	//pre = ob.getValor()*can3;
                	ob2.setCantidad(ob2.getCantidad()+can4);
                }
                
                 
            }
            
            Iterator<ClienteC> it3 = lista6.iterator();
            ClienteC ob3;
            while (it3.hasNext()){	
                ob3 = it3.next();
                if(ob3.getLista()==pro) {
                    it3.remove();
                }               
            }
            
        }
        
       //-----------------------------
        
        }
 
	
	 public ImageIcon createImage(String path) {
		  URL imgURL = getClass().getResource(path);
		     if (imgURL != null) {
		         return new ImageIcon(imgURL);
		     } else {
		         System.err.println("Couldn't find file: " + path);
		         return null;
		     }
		 }
	
}
        	
        
		
		
	
