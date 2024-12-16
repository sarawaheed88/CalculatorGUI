import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Font f18 = new Font ( " Times New Roman " , Font.BOLD , 18 );
        Font f28 = new Font ( " Times New Roman " , Font.BOLD , 28 );



        JFrame frame = new JFrame( " Calculater ");
        frame.setSize( 435 , 420);
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setLayout( null );

        JLabel oldValue = new JLabel(" 0 ");
        JLabel op = new JLabel( "+");
        JLabel newValue = new JLabel( " 0 ");
        oldValue.setBounds( 0, 5 , 380 , 25 );
        op.setBounds( 390 , 5 , 15 , 25 );
        newValue.setBounds( 0, 30 , 400 , 100);

        oldValue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        newValue.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );

        oldValue.setFont( f18 );
        op.setFont( f18 );
        newValue.setFont( f28 );

        frame.add( oldValue );
        frame.add( op );
        frame.add( newValue );


        }
    }
