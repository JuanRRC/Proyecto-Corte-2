package Grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class Inferior extends JPanel implements ActionListener {

    public static final String GANANCIAS = "GANANCIAS";
    public static final String MEJOR = "MEJOR";
	
    private JButton ganancias,mejor;

	public Inferior() {
		super();
		//this.referencia_tabla_model = referencia_tabla_model;
		//this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  
	}


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

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

        	
        }
	}

