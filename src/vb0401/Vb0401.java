package vb0401;

// Voorbeeld 0401
// Invoer van bedrag exclusief BTW, uitvoer van bedrag inclusief BTW 
import javax.swing.*;
import java.awt.event.*;  
   
public class Vb0401 extends JFrame {
  public static void main( String args[] ) {
    JFrame frame = new Vb0401();
    frame.setSize( 420, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Voorbeeld 0401" );
    frame.setContentPane( new BTWPaneel() );
    frame.setVisible( true );
  }
}

// Het paneel 
class BTWPaneel extends JPanel {
  private JTextField invoerVak, uitvoerVak;
  private JButton knopBTW;
  final double percentageBTW = 21.0;

  public BTWPaneel() {
    invoerVak = new JTextField( 10 );
    uitvoerVak = new JTextField( 10 );
    knopBTW = new JButton( "Inclusief " + percentageBTW + "% btw" );
    knopBTW.addActionListener( new KnopBTWHandler() );

    add( invoerVak );
    add( knopBTW );
    add( uitvoerVak );
  }

  class KnopBTWHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
 
    }
  }
}