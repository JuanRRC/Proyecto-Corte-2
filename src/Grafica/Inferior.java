package Grafica;
import Objeto.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 * Metodo inferior que contiene una imagen y dos botones de calculos..
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Electrodomesticos 1.0.0
 */

public class Inferior extends JPanel implements ActionListener {

    public static final String GANANCIAS = "GANANCIAS";
    public static final String MEJOR = "MEJOR";
	private ArrayList<ClienteC> lista2 = new ArrayList<ClienteC>();
	private ArrayList<Cliente> lista3 = new ArrayList<Cliente>();
	private ArrayList<ClienteF> lista4 = new ArrayList<ClienteF>();
    
    
    private JButton ganancias,mejor;

    /**
     * Constructor de la clase que tiene como parametro dos listas con datos para trabajar
     * @param lista
     * @param clientes
     */
	public Inferior(ArrayList<Cliente>lista,ArrayList<ClienteC>clientes) {
		super();
		this.lista2=clientes;
		this.lista3=lista;
		//this.referencia_tabla_model = referencia_tabla_model;
		//this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  
	}

	/**
	 *Metodo Iniciar que crea los componentes del panel 
	 */
	
	public void iniciar() {

		 		
        setLayout( new GridBagLayout( ) );

        Border borde = BorderFactory.createTitledBorder( "" );
        setBorder( borde );
        
       
        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;

        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        
        
        mejor = new JButton( "Consultar Mejores Clientes" );
        mejor.addActionListener( this );
        mejor.setActionCommand( MEJOR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 3;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( mejor, constraint );
        
        
        ganancias = new JButton( "Consultar Ganancias de las compras" );
        ganancias.addActionListener( this );
        ganancias.setActionCommand( GANANCIAS );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 6;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( ganancias, constraint );
        
        
        JLabel imagen = new JLabel( );

        ImageIcon icono = new ImageIcon( "imagen/correos.png" );
        imagen.setIcon( icono );
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.WEST; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( imagen, constraint );
        
	}

	/**
	 * Metodo actionPerformed que ejecuta las acciones de los botones
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String accion = e.getActionCommand( );
		

		 //----------------------------------------------------------------------------------------
		 if( accion.equals( GANANCIAS ) ) {
			 int acum=0;
			 Iterator<ClienteC> it = this.lista2.iterator();
			 ClienteC ob;
             while (it.hasNext()){
                 ob = it.next();
                 acum=acum+ob.getCompra();
                 System.out.println("cantidad : "+ob.getCompra());
                 
                  
             }
             JOptionPane.showMessageDialog(null,"Ganancia Total : "+acum);
         }
		 
		 
		 //----------------------------------------------------------------------------------------
		 if( accion.equals( MEJOR ) ) {
			 try {
			 Collections.sort(this.lista2);
			 Iterator<Cliente> it = this.lista3.iterator();
			 Cliente ob;
             while (it.hasNext()){
            	 ob = it.next();
            	 if(ob.getCedula()==lista2.get(0).getCedula()) {
            		 //String nombre, String apellido, String cedula, String empresa, int edad, float sueldo, int compra
            		 lista4.add(new ClienteF(ob.getNombre(),ob.getApellido(),lista2.get(0).getCedula(),ob.getEmpresa(),ob.getEdad(),ob.getSueldo(),lista2.get(0).getCompra()));
            		 
            		 //System.out.println(ob.getNombre()+ob.getApellido()+lista2.get(0).getCedula()+ob.getEmpresa()+ob.getEdad()+ob.getSueldo()+lista2.get(0).getCompra());
            		 String nl = System.getProperty("line.separator");
            		 JOptionPane.showMessageDialog(null,"-------Persona Agregada--------"+nl+"Nombre :"+ob.getNombre()+nl+"Apellido : : "+ob.getApellido()+nl+"Cedula: "+ob.getCedula()+nl+"Edad : "+ob.getEdad()
                     		+nl+"Empresa :"+ob.getEmpresa()+nl+"Sueldo : "+ob.getSueldo(), "Datos Registrados",JOptionPane.INFORMATION_MESSAGE,ob.getFoto3());
            	 
            	 
            	 }
                 
                 
                  
             }
			 }catch(IndexOutOfBoundsException ex) {
				 JOptionPane.showMessageDialog(this, " No hay datos en el sistema (Se eliminaron o no existen) ", "Error!", JOptionPane.ERROR_MESSAGE);
			 }
			 
		 }
		 
		 
		 
		 
		 
        }
	
	//Fin de la clase Inferior
	}

