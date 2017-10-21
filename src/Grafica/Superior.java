package Grafica;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase JPanel Superior que contiene la imagen cabezera  de la ventana..
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Electrodomesticos 1.0.0
 */


public class Superior extends JPanel{
	
	public Superior() {
		  setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );

	        ImageIcon icono = new ImageIcon( "imagen/UdeC.jpg" );

	        imagen.setIcon( icono );

	        add( imagen, BorderLayout.CENTER );
	               
	        setBackground( Color.WHITE );
	}

	//Fin de la clase Superior.
}
